package com.barclaycard.bPaid.app.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.barclaycard.bPaid.app.utility.BinaryConverter;
import com.barclaycard.bPaid.app.utility.BitMapping;

public class ReadFile {
	public static void main(String[] args) {
			try {
				int count=0;
				BufferedReader in = new BufferedReader(new FileReader("D:/testFile.txt"));
				String line=in.readLine();
				String t=line.substring(1,5);//1 nantar 5 paryant
				String []arr=line.split("\\|");
				for(String txn:arr)
				{
					if(txn.startsWith("9200"))
					{
						System.out.println(txn);
					String hex;
					hex=txn.substring(4,20);
					
					System.out.println("hexadecimal=="+hex);
					String binary=BinaryConverter.hexToBin(hex);
					System.out.println("binary=="+binary);
					char[] chars = binary.toCharArray();
					for(char c:chars)
					{
						++count;
						if(Character.getNumericValue(c)==1)
						{
							
							String bitValue=BitMapping.getMapping(count);
						System.out.println("count###=="+count);
						String value[]=bitValue.split(" ");
						
						
						
						}
						
					}
					
				}
				}
				System.out.println(line);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
	
	}

}
