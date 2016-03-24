/**
 * 
 */
package jdbc.connectionpool;

import java.sql.Connection;

/**  
 * Copyright: Copyright (c) 2016 Asiainfo
 * 
 * @ClassName: IConnectionPool.java
 * @Description: TODO
 *
 * @version: 0.0.1-SNAPSHOT
 * @author: gengxy
 * @date: 2016年3月22日 上午10:32:18 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * 2016年3月22日      gengxy          0.0.1-SNAPSHOT     TODO
*/
public interface IConnectionPool {
	
	/**
	 * @Function: IConnectionPool::getConnection
	 * @Description: 获取链接
	 * @return
	 * @version: 0.0.1-SNAPSHOT
	 * @author: gengxy
	 * @date: 2016年3月22日 下午2:12:23 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2016年3月22日      gengxy          0.0.1-SNAPSHOT     新增方法
	 */
	public Connection getConnection();
	
	/**
	 * @Function: IConnectionPool::getCurrentConnection
	 * @Description: Get current connection
	 * @return
	 * @version: 0.0.1-SNAPSHOT
	 * @author: gengxy
	 * @date: 2016年3月22日 下午4:01:57 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2016年3月22日      gengxy          0.0.1-SNAPSHOT     新增方法
	 */
	public Connection getCurrentConnection();
	
	/**
	 * @Function: IConnectionPool::releaseConnection
	 * @Description: 释放链接
	 * @param connection
	 * @version: 0.0.1-SNAPSHOT
	 * @author: gengxy
	 * @date: 2016年3月22日 下午2:12:36 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2016年3月22日      gengxy          0.0.1-SNAPSHOT     新增方法
	 */
	public void releaseConnection(Connection connection);
	
	/**
	 * @Function: IConnectionPool::isActive
	 * @Description: 判断连接池状态是否可用
	 * @return
	 * @version: 0.0.1-SNAPSHOT
	 * @author: gengxy
	 * @date: 2016年3月22日 下午2:22:34 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2016年3月22日      gengxy          0.0.1-SNAPSHOT     新增方法
	 */
	public boolean isActive();
	
	/**
	 * @Function: IConnectionPool::clear
	 * @Description: 清空连接池
	 * @version: 0.0.1-SNAPSHOT
	 * @author: gengxy
	 * @date: 2016年3月22日 下午2:13:11 
	 *
	 * Modification History:
	 * Date         Author          Version            Description
	 *-------------------------------------------------------------
	 * 2016年3月22日      gengxy          0.0.1-SNAPSHOT     新增方法
	 */
	public void clear();
	
}
