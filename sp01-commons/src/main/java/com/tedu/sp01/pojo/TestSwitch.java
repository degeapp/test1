package com.tedu.sp01.pojo;

import java.util.Arrays;

public class TestSwitch {
//public static void main(String[] args) {
	
	//String str="123456789";
	
	//char[] a = str.toCharArray();
	//System.out.println(a);

//int  b= str.indexOf("9");
//int b = str.length();
//boolean b = str.startsWith("1");
	//String b = str.replace("abc", "efg");
	//String a= str.substring(4, 8);
	//System.out.println(b);
	
	  public static void main(String[] args) {  
	        // TODO Auto-generated method stub  
	         int hundred, ten, bits;    
	         System.out.println("水仙花数为：");    
	         for (int i = 100; i <= 999; i++)    
	         {    
	             hundred = i / 100;    
	             ten = i % 100 / 10;    
	             bits = i % 10;    
	             if (i == hundred * hundred * hundred + ten * ten * ten + bits * bits * bits)    
	             {    
	                 System.out.print(i + "    ");    
	             }    
	         }      
	    }  
	
		/*
		 * String str[]= {"1","2","3","4","5","1","2","3","4","5"}; String a="123"; for
		 * (int i = 0; i < str.length; i++) { str[i]=a; System.out.println(str[i]); }
		 */
	
	//float c=1.0f;
	//float b=2.0f;
	// d=(int) c;
	
//}
	//char num;
//	String a= String.valueOf(num);
	
	///float   f   =   Float.parseFloat(num);


	
}
