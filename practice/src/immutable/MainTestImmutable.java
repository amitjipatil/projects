package immutable;

import java.util.ArrayList;

/**
 * @author amit
 *
 */
public class MainTestImmutable {
	public static void main(String[] args) {
		
		Course pcm=new Course(1, "Physics", "Chemistry", "Maths");
		ArrayList<Integer> favourateno=new ArrayList<Integer>();
		favourateno.add(5);
		favourateno.add(7);
		favourateno.add(44);
		favourateno.add(26);
		
		CustomImmutable immobj1=new CustomImmutable(1, "Amit", pcm, favourateno);
		immobj1.getFavourateno().add(120);
		immobj1.getCourse().setCourseid(25);
		
		System.out.println(immobj1);
	}

}
