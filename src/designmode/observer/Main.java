package designmode.observer;

import designmode.observer.ebus.GxyBus;
import designmode.observer.ebus.IBus;
import designmode.observer.ob.impl.Huamiao;
import designmode.observer.ob.impl.Shenyuanshuai;
import designmode.observer.ob.intef.Observer;

public class Main {

	public static void main(String[] args) {
		IBus bus = new GxyBus();
		Observer shenyuanshuai = new Shenyuanshuai();
		Observer huamiao = new Huamiao();
		bus.addObserver(shenyuanshuai);
		bus.addObserver(huamiao);

		for (Observer observer : bus.getObservers()) {
			observer.update(observer.getName() + "big milk son is coming.");
		}
		
		bus.removeObserver(shenyuanshuai);
		System.out.println("------------------------------");
		for (Observer observer : bus.getObservers()) {
			observer.update(observer.getName() + "big milk son is coming.");
		}
	}
}
