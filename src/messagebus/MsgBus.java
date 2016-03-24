package messagebus;

import java.util.ArrayList;
import java.util.List;

public class MsgBus {
	private static MsgBus msgBus;
	private List<Observer> observerList = new ArrayList<Observer>();

	public static MsgBus getInstance() {
		if (msgBus == null) {
			msgBus = new MsgBus();
		}
		return msgBus;
	}

	public void register(Observer observer) {
		observerList.add(observer);
	}

	public void unregister(Observer observer) {
		observerList.remove(observer);
	}

	public void notify(Message msg) {
		if (Message.READY.equals(msg.getType())) {
			for (Observer observer : observerList) {
				observer.onNotified();
			}
		}
	}
}
