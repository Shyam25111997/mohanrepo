package com.training;


import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("Ramesh","Suresh");
		nameList.forEach(System.out::println);
		
		for(String eachItem:nameList) {
		
			System.out.println(eachItem);
		}
		
		Book java = new Book(102,"Learn Java in 15days");
		System.out.println(java);
		System.out.println("Edited by Developer Suhas S");
	}
	
	
}
