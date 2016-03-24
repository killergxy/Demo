package designmode.factory.factorymethod;

public class AdidasShoesFactory implements ISportShoesFactory {

	@Override
	public ISportShoes getShoes() {
		return new Adidas();
	}

}
