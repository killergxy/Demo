package orderexample.firstflow;

public class GSMConfirm implements Confirm {

	@Override
	public void confirmMessage() {
		System.out.println("GSM confirm correct");
		//....
	}
}
