package com.jbktutorials.overload2;

public class STest {
	public static void main(String[] args) {
		S s1=new S();
		//s1.h1(22,32);
		s1.h1();
		s1.h1("Pune City",1000);
		s1.h1(2000,"Nagpur");
	}
}
