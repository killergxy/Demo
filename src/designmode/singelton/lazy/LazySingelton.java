package designmode.singelton.lazy;

public class LazySingelton {
	public LazySingelton() {
	}

	private static LazySingelton instance = null;

	public static LazySingelton getInstanece() {
		if (null == instance) {
			instance = new LazySingelton();
		}
		return instance;
	}
}
