package com.tnsif.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareMain {

	public static void main(String[] args) {
		List<Persons> ai = new ArrayList<>();
		
		ai.add(new Persons(23,"Nikki"));
		ai.add(new Persons(42,"Teja"));
		ai.add(new Persons(33,"Manu"));
		ai.add(new Persons(64,"Siddhu"));
		
		System.out.println("Before sorting");
		for(Persons ps:ai) {
		System.out.println(ps);
		}
		
		System.out.println("After sorting");
		Collections.sort(ai,new CompareName());
		for(Persons ps:ai) {
		System.out.println(ps);
		}
	}

}
