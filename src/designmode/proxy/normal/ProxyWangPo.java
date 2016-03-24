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
		System.out.println(name + "需要嗨皮啦！");
		women.happyWithMan();
	}

	@Override
	public void maskEyes() {
		System.out.println(name + "需要抛媚眼啦！");
		women.maskEyes();
	}

}
