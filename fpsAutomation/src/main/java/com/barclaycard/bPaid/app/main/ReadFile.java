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
				//read file
				BufferedReader in = new BufferedReader(new FileReader("D:/testFile.txt"));
				// read line
				String line=in.readLine();
				//String t=line.substring(1,5);//1 nantar 5 paryant
				// find transactions using | (pipe)
				String []arr=line.split("\\|");
				// perform operation on each transactions
				for(String txn:arr)
				{
					//skip  header an footer part
					if(txn.startsWith("9200"))
					{
						System.out.println(txn);
					//find hex and convert to binary
					String binary=BinaryConverter.hexToBin(txn.substring(4,20));
					//System.out.println("binary=="+binary);
					
					//find the bit position
					char[] chars = binary.toCharArray();
					for(char c:chars)
					{
						++count;
						//check whether the position is one or zero
						if(Character.getNumericValue(c)==1)
						{
							// find the bit name bits start_position and bits end_position
							System.out.println("count==="+count);
							String bitValue=BitMapping.getMapping(count);
							System.out.println("bit value="+bitValue);
						
						String value[]=bitValue.split(" ");
						for(String s:value)
						{
							System.out.println("@@@@@@@@@@@@@@"+s);
						}
						
						
						
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
