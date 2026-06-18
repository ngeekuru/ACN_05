package com.tnsif.sample;

import java.util.Comparator;

public class CompareAge implements Comparator<Persons>{

	@Override
	public int compare(Persons o1, Persons o2) {
		
		return Integer.compare(o1.age, o2.age);
	}

}
