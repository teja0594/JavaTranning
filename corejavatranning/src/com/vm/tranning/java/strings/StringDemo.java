package com.vm.tranning.java.strings;

public class StringDemo {
public static void main(String[] args) {
	String s ="Teja";
	String s1= "Kedari";
	String s2 = new String("Teja");
	String s3 =  new String("Kedari");
	System.out.println(s==s2);
	System.out.println(s.equals(s2));
	System.out.println(s2.concat(s1));
}
}
