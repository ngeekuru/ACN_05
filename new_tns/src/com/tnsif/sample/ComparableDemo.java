package com.tnsif.sample;

import java.util.*;

public class ComparableDemo {

	public static void main(String[] args) {
		List<Person> al = new ArrayList<>();
		al.add(new Person(22,"nikki"));
		al.add(new Person(41,"kiran"));
		al.add(new Person(32,"shila"));
		al.add(new Person(12,"mahi"));
		
		System.out.println("Before sorting");
		for(Person p:al) {
		System.out.println(p);
		}
		
		System.out.println("After sorting");
		Collections.sort(al);
		for(Person p:al) {
		System.out.println(p);
		}
		
		
		

	}

}
