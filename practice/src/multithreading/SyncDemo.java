package multithreading;

public class SyncDemo {
	public static void main(String[] args) {
		Synchronise s1=new Synchronise();
	//	Synchronise s2=new Synchronise(); 
		Mythr t=new Mythr(s1);
		t.setName("first");
		Mythr t2=new Mythr(s1);
		t2.setName("second");		
		t.start();
		t2.start();
		
	}

}
