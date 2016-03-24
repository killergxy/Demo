package messagebus;

public class SecondFlowObserver implements Observer {

	@Override
	public void onNotified() {
		System.out.println("接收到一级流程结束的消息!");
	}

}
