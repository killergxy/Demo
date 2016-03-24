package designmode.factory.abstractfactory.factory;

import designmode.factory.abstractfactory.IAbstractFactory;
import designmode.factory.abstractfactory.eat.impl.NongFuHeiYu;
import designmode.factory.abstractfactory.eat.intf.Eat;
import designmode.factory.abstractfactory.traffic.impl.Taxi;
import designmode.factory.abstractfactory.traffic.intf.Traffic;

public class TuhaoFactory implements IAbstractFactory {

	@Override
	public Eat getEat() {
		return new NongFuHeiYu();
	}

	@Override
	public Traffic getTraffic() {
		return new Taxi();
	}

}
