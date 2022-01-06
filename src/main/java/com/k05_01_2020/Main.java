package com.k05_01_2020;

/**
 * @author Sergey Manko
 */
public class Main {
	public static void main(String[] args) {
		Course engineer = new Course("engineer");
		Course programmer = new Course("Programmer");
		Student marsha = new Student("Marsha", "Jones", new Address("21 Jump Street", "Blacksburg",
				"VA", 24551), new Address("800 Lancaster Ave.", "Villanova",
				"PA", 19085), 2, 4, 5, engineer);
		Student kyrylo = new Student("Kyrylo", "James", new Address("21 Jump Street", "Blacksburg",
				"VA", 24551), new Address("800 Lancaster Ave.", "Villanova",
				"PA", 19085), 5, 5, 5, programmer);
		Student agent = new Student("Agent", "Bond", new Address("21 Jump Street", "Blacksburg",
				"VA", 24551), new Address("800 Lancaster Ave.", "Villanova",
				"PA", 19085), 2, 3, 4, programmer);
		engineer.addStudent(marsha);
		engineer.addStudent(kyrylo);
		programmer.addStudent(agent);
		programmer.roll(programmer);
		engineer.roll(engineer);

	}
}
