package com.barclaycard.bPaid.app.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.barclaycard.bPaid.app.utility.BinaryConverter;

public class ReadFile {
	public static void main(String[] args) {
		     BinaryConverter binaryConverter=new BinaryConverter();
		     
		
			
			try {
				BufferedReader in = new BufferedReader(new FileReader("D:/testFile.txt"));
				String line=in.readLine();
				String t=line.substring(1,5);//1 nantar 5 paryant
				String []arr=line.split("\\|");
				for(String txn:arr)
				{
					if(txn.startsWith("9200"))
					{
					String hex;
					hex=txn.substring(4,20);
					System.out.println(txn);
					System.out.println("hexadecimal=="+hex);
					String binary=binaryConverter.hexToBin(hex);
					System.out.println("binary=="+binary);
				}
				}
				System.out.println(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
	
	}

}
