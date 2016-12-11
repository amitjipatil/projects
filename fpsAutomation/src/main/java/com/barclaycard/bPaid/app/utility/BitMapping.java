package com.barclaycard.bPaid.app.utility;

import java.util.HashMap;

public class BitMapping {
	static HashMap<Integer,String> hm;
	public static String getMapping(int key1)
	{
		hm=new HashMap<Integer, String>();
		
		hm.put(1,"BitMapSecondary 21 37");
		hm.put(2,"ProcessingCode 37 43");
		hm.put(4,"OriginalAmount 43 57");
		hm.put(6,"Amount 57 71");
		hm.put(10,"ExchangeRate 71 83");
		hm.put(12,"DateSent 83 91");
		hm.put(13,"temp 25 30");
		hm.put(14,"temp 25 30");
		hm.put(15,"temp 25 30");
		hm.put(16,"temp 25 30");
		hm.put(17,"temp 25 30");
		hm.put(18,"temp 25 30");
		hm.put(19,"temp 25 30");
		hm.put(20,"temp 25 30");
		hm.put(21,"temp 25 30");
		hm.put(22,"temp 25 30");
		hm.put(23,"temp 25 30");
		hm.put(24,"temp 25 30");
		hm.put(25,"temp 25 30");
		hm.put(26,"temp 25 30");
		hm.put(27,"temp 25 30");
		hm.put(28,"temp 25 30");
		hm.put(29,"temp 25 30");
		hm.put(30,"temp 25 30");
		hm.put(31,"temp 25 30");
		hm.put(32,"temp 25 30");
		hm.put(33,"temp 25 30");
		hm.put(34,"temp 25 30");
		hm.put(35,"temp 25 30");
		hm.put(36,"temp 25 30");
		hm.put(37,"temp 25 30");
		hm.put(38,"temp 25 30");
		hm.put(39,"temp 25 30");
		hm.put(40,"temp 25 30");
		hm.put(41,"temp 25 30");
		hm.put(42,"temp 25 30");
		hm.put(43,"temp 25 30");
		hm.put(44,"temp 25 30");
		hm.put(45,"temp 25 30");
		hm.put(46,"temp 25 30");
		hm.put(47,"temp 25 30");
		hm.put(48,"temp 25 30");
		hm.put(49,"temp 25 30");
		hm.put(50,"temp 25 30");
		hm.put(51,"temp 25 30");
		hm.put(52,"temp 25 30");
		hm.put(53,"temp 25 30");
		hm.put(54,"temp 25 30");
		hm.put(55,"temp 25 30");
		hm.put(56,"temp 25 30");
		hm.put(57,"temp 25 30");
		hm.put(58,"temp 25 30");
		hm.put(59,"temp 25 30");
		hm.put(60,"temp 25 30");
		hm.put(61,"temp 25 30");
		hm.put(62,"temp 25 30");
		hm.put(63,"temp 25 30");
		hm.put(64,"temp 25 30");
		
		
		
		
		return hm.get(key1);
		
	}

}
