package com.tnsif.sample;

import java.util.Comparator;

public class CompareName implements Comparator<Persons>{
	
	public int compare(Persons o1, Persons o2) {
        return o1.getName().compareTo(o2.getName());
    }
	

}
