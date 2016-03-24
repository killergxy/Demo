package jdbc.connectionpool.bean;

public class DbBean {
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getMaxConnection() {
		return maxConnection;
	}

	public void setMaxConnection(int maxConnection) {
		this.maxConnection = maxConnection;
	}

	public int getMinConnection() {
		return minConnection;
	}

	public void setMinConnection(int minConnection) {
		this.minConnection = minConnection;
	}

	public int getInitConnection() {
		return initConnection;
	}

	public void setInitConnection(int initConnection) {
		this.initConnection = initConnection;
	}

	public String getPoolName() {
		return poolName;
	}

	public void setPoolName(String poolName) {
		this.poolName = poolName;
	}
	
	public long getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(long waitTime) {
		this.waitTime = waitTime;
	}

	private String userName ="ord_base";
	
	private String password="ord_base";
	
	private String url ="jdbc:oracle:thin:@20.26.11.4:1521:CSHP01";;
	
	private int maxConnection =10;
	
	private int minConnection = 1;
	
	private int initConnection =5;
	
	private String poolName;

	private long waitTime = 1000* 60;
	
}