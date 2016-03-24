package designmode.factory.abstractfactory.factory;

import designmode.factory.abstractfactory.IAbstractFactory;
import designmode.factory.abstractfactory.eat.impl.Shaxian;
import designmode.factory.abstractfactory.eat.intf.Eat;
import designmode.factory.abstractfactory.traffic.impl.Bus;
import designmode.factory.abstractfactory.traffic.intf.Traffic;

public class DiaosiFactory implements IAbstractFactory {

	@Override
	public Eat getEat() {
		return new Shaxian();
	}

	@Override
	public Traffic getTraffic() {
		return new Bus();
	}

}
