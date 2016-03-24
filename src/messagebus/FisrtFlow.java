package messagebus;

public class FisrtFlow {

	public static void beforeFirstFlowReady() {
		//
		System.out.println("二级流程向消息总线增加监听");
		MsgBus.getInstance().register(new SecondFlowObserver());
	}

	public static void main(String[] args) {
		beforeFirstFlowReady();

		// 处理一级流程内容
		System.out.println("处理一级流程的内容");

		FisrstFlowMessage firstMessage = new FisrstFlowMessage();
		firstMessage.setType(Message.READY);
		//
		System.out.println("一级流程处理完毕");
		MsgBus.getInstance().notify(firstMessage);

	}

}
