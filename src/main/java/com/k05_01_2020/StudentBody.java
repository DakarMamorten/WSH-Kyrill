package com.k05_01_2020;

public class StudentBody {

	public static void main(String[] args) {
		Address school = new Address("800 Lancaster Ave.", "Villanova",
				"PA", 19085);
		Address jHome = new Address("21 Jump Street", "Blacksburg",
				"VA", 24551);
		Student john = new Student("John", "Smith", jHome, school, 3, 3, 3);

		Address mHome = new Address("123 Main Street", "Euclid", "OH",
				44132);
		Student marsha = new Student("Marsha", "Jones", mHome, school, 2, 4, 5);
		Student kyrylo = new Student("Kyrylo", "James", mHome, school, 5, 5, 5);
		Student agent = new Student("Agent", "Bond", mHome, school);
		System.out.println(john);
		System.out.println();
		System.out.println(marsha);
		System.out.println();
		System.out.println(agent);
		System.out.println();
		System.out.println(kyrylo.getTestScore(1));
		System.out.println();
		System.out.println(kyrylo);
	}
}
