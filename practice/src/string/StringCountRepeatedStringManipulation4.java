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
    public static Map <String,Integer>hm=new HashMap<String,Integer>();
	
	public static void main(String[] args) {
		
		countDuplicateStrings("I am ok with this. I am not ok with that. are you ok ?");
		// method to find duplicate characters in string
		String name1= "succesfully saved engineering";
		countDuplicateCharacters(name1);
	}

	
	//method to find and count duplicate string
	private static void countDuplicateStrings(String str) {
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
		
	}



	//method to find duplicate character
	private static void countDuplicateCharacters(String name1) {
	
		Map <Character,Integer>charhm=new HashMap<Character,Integer>();
		
		int count=name1.length();
		for(int i=0;i<count;i++)
		{
			char ch=name1.charAt(i);
			Integer num=charhm.get(ch);
			//check whether key value is present in map
			if(num!=null)
					{
				// if num is not null means some entry is present in hashmap so add num+1 and put it  in map. it will replace previus entry
				charhm.put(ch,num+1);
					}
			//if num==null ie entry is not present then add new entry with initial value 1 in hashmap
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
