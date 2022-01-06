package com.k05_01_2020;

public class Kennel {
	public static void main(String[] args) {
		Dog dog = new Dog("Rex", 5);
		Dog picki = new Dog("Artur", 4);
		Dog micki = new Dog("Omen", 8);
		Dog jeck = new Dog("Jack", 9);
		System.out.println(dog.getAgePeople());
		System.out.println(picki.getAgePeople());
		System.out.println(micki.getAgePeople());
		System.out.println(jeck);
	}
}
