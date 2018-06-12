package string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringCountRepeatedStringManipulation4 {
// program to display repeated or duplicates words/strings and count(number of repeatations)
	// also 1 method in this class to find duplicate CHARACTERS from given string
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map <String,Integer>hm=new HashMap<String,Integer>();
		String str="I am ok with this. I am not ok with that. are you ok ?";
		String sarray[]=str.split(" ");
		for(String string:sarray)
		{
		
			Integer num=hm.get(string);
			if(num!=null)
			{
			
				hm.put(string, num+1);
			}
			else
			hm.put(string, 1);
		}
		
		Iterator<String> it=hm.keySet().iterator();
		while(it.hasNext())
		{
			String s=it.next();
			int i=hm.get(s);
			if(i!=1)
			System.out.println(s+" is repeated "+i+" times");
		}
		
		System.out.println("********************************");
		
		
		// method to find duplicate characters in string
		String name1= "succesfully saved engineering";
		countDuplicateCharacters(name1);
	}

	
	
	private static void countDuplicateCharacters(String name1) {
	
		Map <Character,Integer>charhm=new HashMap<Character,Integer>();
		
		int count=name1.length();
		for(int i=0;i<count;i++)
		{
			char ch=name1.charAt(i);
			Integer num=charhm.get(ch);
			if(num!=null)
					{
				charhm.put(ch,num+1);
					}
			else
				charhm.put(ch,1);
		}
		
		Iterator<Character> iterator=charhm.keySet().iterator();
		while(iterator.hasNext())
		{
			Character character=iterator.next();
			int i=charhm.get(character);
			if(i!=1)
			System.out.println(character+" is repeated "+i+" times");
		}
	}

}
