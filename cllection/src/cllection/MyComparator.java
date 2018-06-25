package cllection;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1=(Employee)o1;
		Employee e2=(Employee)o2;
		if (e1.name.equals(e2.name))
		{
			if(e1.id<e2.id)
			return -1;
			else if(e1.id>e2.id)
				return 1;
			else return 0;
			
		}
		return e1.compareTo(e2);
			
	//	return 0;
	}
	

}
