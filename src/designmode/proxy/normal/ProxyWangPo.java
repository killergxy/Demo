package designmode.proxy.normal;

public class ProxyWangPo implements Women {
	Women women;
	String name;
	public ProxyWangPo(Women women,String name){
		this.women = women;
		this.name = name;
	}
	
	@Override
	public void happyWithMan() {
		System.out.println(name + "��Ҫ��Ƥ����");
		women.happyWithMan();
	}

	@Override
	public void maskEyes() {
		System.out.println(name + "��Ҫ����������");
		women.maskEyes();
	}

}
