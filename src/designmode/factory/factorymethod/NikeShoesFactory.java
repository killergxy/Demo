package designmode.factory.factorymethod;

public class NikeShoesFactory implements ISportShoesFactory {

	@Override
	public ISportShoes getShoes() {
		return new NikeShoes();
	}

}
