package messagebus;

public class FisrtFlow {

	public static void beforeFirstFlowReady() {
		//
		System.out.println("������������Ϣ�������Ӽ���");
		MsgBus.getInstance().register(new SecondFlowObserver());
	}

	public static void main(String[] args) {
		beforeFirstFlowReady();

		// ����һ����������
		System.out.println("����һ�����̵�����");

		FisrstFlowMessage firstMessage = new FisrstFlowMessage();
		firstMessage.setType(Message.READY);
		//
		System.out.println("һ�����̴������");
		MsgBus.getInstance().notify(firstMessage);

	}

}
