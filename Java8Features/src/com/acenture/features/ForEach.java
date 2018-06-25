package com.acenture.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {

	public static void main(String[] args) {
		List <Topic> topicList=new ArrayList<Topic>();
		
			
		topicList.add(new Topic("Spring",12,"spring description"));
		topicList.add(new Topic("dotnet",89,".Net description"));
		topicList.add(new Topic("Javascript",44,"javasscript description"));
			
		topicList.forEach(s -> System.out.println(s+","));
		
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);
		
		topicList.forEach( x -> System.out.println(x.getId()));
		topicList.forEach(System.out::println);
		  
		
	//	topicList.forEach(y -> y.getId()==44 System.out::println);
		
		topicList.stream().filter(t -> t.getId()==44).findFirst().get();

		
	}

}
