package com.tnsif.getset;

public class studentdetails {

	public static void main(String[] args) {
		student std = new student();
		std.setStdid(102);
		std.setStdname("teja");
		std.setMarks(87.34);
		std.setClgname("KLU");
		System.out.println(std.getStdid());
		System.out.println(std.getStdname());
		System.out.println(std.getMarks());
		System.out.println(std.getClgname());

	}

}
