package messagebus;

public class SecondFlowObserver implements Observer {

	@Override
	public void onNotified() {
		System.out.println("���յ�һ�����̽�������Ϣ!");
	}

}
