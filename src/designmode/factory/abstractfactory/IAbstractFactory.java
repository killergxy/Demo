package designmode.factory.abstractfactory;

import designmode.factory.abstractfactory.eat.intf.Eat;
import designmode.factory.abstractfactory.traffic.intf.Traffic;

public interface IAbstractFactory {
	public Eat getEat();
	public Traffic getTraffic();
}
