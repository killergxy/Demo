package designmode.singelton.hungry;

public class HungrySingelton {
	public HungrySingelton(){};
	
	private static HungrySingelton instance = new HungrySingelton();
	
	public static HungrySingelton getInstance(){
		return instance;
	}
	
	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
	}
}
