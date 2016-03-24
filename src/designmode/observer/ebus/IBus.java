package designmode.observer.ebus;

import java.util.List;

import designmode.observer.ob.intef.Observer;

public interface IBus {
	public void addObserver(Observer observer);
	
	public void removeObserver(Observer observer);
	
	public List<Observer> getObservers();
}
