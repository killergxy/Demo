package designmode.factory.abstractfactory.traffic.impl;

import designmode.factory.abstractfactory.traffic.intf.Traffic;

public class Bus implements Traffic {

	@Override
	public String getTrafficWay() {
		return "132路公交车";
	}

}
