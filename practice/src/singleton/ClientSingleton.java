package singleton;

public class ClientSingleton {

	public static void main(String[] args) {
       Singleton obj=Singleton.getInstance();
		Thread t=new Thread();

       Singleton obj1=Singleton.getInstance();
       
     
     System.out.println("hashcode= "+obj.hashCode());
     System.out.println("hashcode= "+obj1.hashCode());
	}

}
