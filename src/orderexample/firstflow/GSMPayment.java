package orderexample.firstflow;

public class GSMPayment implements Payment {

	@Override
	public void payMessage() {
		System.out.println("Gsm payment success...");
		//....
	}

}
