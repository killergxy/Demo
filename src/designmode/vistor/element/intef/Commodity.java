package designmode.vistor.element.intef;

import designmode.vistor.vistor.intef.IVistor;

public interface Commodity {

	public float getPrice();
	
	public void accept(IVistor vistor);
}
