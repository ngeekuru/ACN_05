package com.tnsif.sample;
abstract class Animal{
	abstract void sound();
}
class dog extends Animal{

	@Override
	void sound() {
		System.out.println("Hello");
	}
	
}
public class Hello {

	public static void main(String[] args) {
		dog d = new dog();
		d.sound();
	}

}
