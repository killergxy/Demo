/**
 * 
 */
package jdbc.connectionpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import jdbc.connectionpool.bean.DbBean;

/**  
 * Copyright: Copyright (c) 2016 Asiainfo
 * 
 * @ClassName: ConnectionPoolImpl.java
 * @Description: 连接池实现
 *
 * @version: 0.0.1-SNAPSHOT
 * @author: gengxy
 * @date: 2016年3月22日 上午10:33:22 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * 2016年3月22日      gengxy          0.0.1-SNAPSHOT   新增类
*/
public class ConnectionPoolImpl implements IConnectionPool {
	private DbBean dbBean = null;
	private List<Connection> freeConnection = new LinkedList<Connection>();
	private List<Connection> activeConnection = new LinkedList<Connection>();
	private int totalConnection = 0;
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();
	private boolean isActive = false;

	public ConnectionPoolImpl(DbBean dbBean) {
		this.dbBean = dbBean;
		init();
	}

	/**
	 * init connection pool
	 */
	private void init() {
		for (int i = 0; i < dbBean.getInitConnection(); i++) {
			Connection newConnection = getNewConnection();
			if (isValid(newConnection)) {
				freeConnection.add(newConnection);
			}
			//TODO  补偿机制
		}
		isActive = true;
	}

	private Connection getNewConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(dbBean.getUrl(),
			        dbBean.getUserName(), dbBean.getPassword());
			
		} catch (SQLException e) {
			//TODO 异常处理
		}
		if(isValid(connection)){
			totalConnection++;
		}
		return connection;
	}

	@Override
	public synchronized Connection getConnection() {
		Connection connection = null;
		//有空闲的连接，返回之
		if (freeConnection.size() > 0) {
			//TODO 连接选取算法，现在默认选择第一个
			connection = freeConnection.remove(0);
		}
		else{
			//链接数未达到上限
			if(totalConnection < dbBean.getMaxConnection()){
				connection = getNewConnection();
			}
			else{ //连接数达到上限，等待释放后重新获取。
				try {
	                wait(dbBean.getWaitTime());
                } catch (InterruptedException e) {
	                e.printStackTrace();
                }
				getConnection();
			}
		}
		if(isValid(connection)){
			activeConnection.add(connection);
			threadLocal.set(connection);
		}
		return connection;
	}
	
	@Override
	public Connection getCurrentConnection(){
		Connection connection = threadLocal.get();
		if(!isValid(connection)){
			connection = getConnection();
		}
		
		return connection;
	}
	
	public boolean isValid(Connection connection){
		try {
	        if(connection == null || connection.isClosed()){
	        	return false;
	        }
        } catch (SQLException e) {
	        e.printStackTrace();
        }
		
		return true;
	}

	@Override
	public void releaseConnection(Connection connection) {
		activeConnection.remove(connection);
		if(!isValid(connection)){
			totalConnection --;
		}
		else{
			freeConnection.add(connection);
		}
	}

	@Override
	public boolean isActive() {
		return isActive;
	}

	@Override
	public void clear() {
		//必须要清除connection，否则会有内存泄漏
		for(Connection conn : freeConnection){
			try {
	            conn.close();
            } catch (SQLException e) {
	            e.printStackTrace();
            }
		}
		
		for(Connection conn : activeConnection){
			try {
	            conn.close();
            } catch (SQLException e) {
	            e.printStackTrace();
            }
		}
		freeConnection.clear();
		activeConnection.clear();
		totalConnection = 0;
		isActive = false;
	}
}
