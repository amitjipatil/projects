package methods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Parent {
	// Object return type,no exception
  Object add()
{
	System.out.println("add parent class");
	return null;
}
  
  void uncheck() throws NullPointerException
  {
	  System.out.println("Parect uncheck method");
  }
  
  // protected scope, List return type , throw checked exception
  protected List test()throws IOException
  {
	  System.out.println("parent test method");
	  return null;
  }
  
  // static method
 static void draw()
 {
	 System.out.println("parent static draw");
 }
 
 // simple method but not overriden in child
 void m1()
 {
	 System.out.println(" m1 parent ");
 }
}

