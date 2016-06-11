package serialisation;
import java.io.*;
public class SerialisationDemo {
	
public static void main(String[] args) {
	try{
	FileOutputStream fout=new FileOutputStream("/tmp/serialisatn.ser");
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	}	

}
