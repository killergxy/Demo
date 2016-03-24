package designmode.observer.ebus;

import java.util.ArrayList;
import java.util.List;

import designmode.observer.ob.intef.Observer;

public class GxyBus implements IBus {
	List<Observer> observers = new ArrayList<Observer>();
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public List<Observer> getObservers() {
		return observers;
	}
}
