package com.usa.cons;

public class DafaultConstractor {

	public static void main(String[] args) {
		 DafaultConstractor obj=new  DafaultConstractor("keshab",100); 
		 DafaultConstractor obj1=new  DafaultConstractor(); 
		 
	 }
	
	DafaultConstractor (){
		
		System.out.println("it is default constractor");
		
	}
	
	DafaultConstractor (String name, int age){
		System.out.println(name);
		System.out.println(age);
		
	}
}