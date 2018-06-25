package com.acenture.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

interface Sayable{  
    void say();  
}  
public class MethodReferance {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = MethodReferance::saySomething;  
        // Calling interface method  
        sayable.say();  
        
        List<String> names =Arrays.asList("Mahesh", "Suresh","Ramesh","Naresh","Kalpesh");	
        names.forEach(System.out::println);
        
    }  
}  
