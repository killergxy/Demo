package orderexample.secondflow;

public class Yewu {
	
	public void run(int factor) {
		Jifei jifei = null;
		Kaitong kaitong = null;
		if (factor == 3) {
			kaitong = new G3Kaitong();
			jifei = new G3Jifei();
		}
		else if(factor == 4){
			kaitong = new G4Kaitong();
			jifei = new G4Jifei();
		}
		else{
			System.out.println("[ERROR]Error factor...");
			return;
		}
		
		kaitong.runKaitong();
		jifei.runJiFei();
	}

}
