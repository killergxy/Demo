package designmode.proxy.normal;

public class Shenyuanshuai {
	public static void main(String[] args) {
		ProxyWangPo wangPo = new ProxyWangPo(new Panjinlian(),Shenyuanshuai.class.getSimpleName());
		wangPo.maskEyes();
		wangPo.happyWithMan();
	}
}
