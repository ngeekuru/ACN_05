package com.tnsif.sup;
abstract class Animal{
	abstract void sound();
}
class Dog extends Ani{
	public void sound()
	{
		System.out.println("hello");
	}
}
class Ani{
	public static void main(String args[])
	{
		Dog ob = new Dog();
		ob.sound();
	}
}