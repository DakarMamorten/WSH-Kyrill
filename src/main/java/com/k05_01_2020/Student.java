package com.k05_01_2020;

public class Student {
	private final String firstName;
	private final String lastName;
	private final Address homeAddress;
	private final Address schoolAddress;
	private int scoreForFirstTest;
	private int scoreForSecondTest;
	private int scoreForThirdTest;
	private Course course;

	public Student(String first, String last, Address home, Address school, int scoreForFirstTest,
			int scoreForSecondTest, int scoreForThirdTest) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		this.scoreForFirstTest = scoreForFirstTest;
		this.scoreForSecondTest = scoreForSecondTest;
		this.scoreForThirdTest = scoreForThirdTest;
	}

	public Student(String first, String last, Address home, Address school, int scoreForFirstTest,
			int scoreForSecondTest, int scoreForThirdTest, Course course) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		this.scoreForFirstTest = scoreForFirstTest;
		this.scoreForSecondTest = scoreForSecondTest;
		this.scoreForThirdTest = scoreForThirdTest;
		this.course = course;
	}

	public Student(String first, String last, Address home, Address school) {
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		this.scoreForFirstTest = 0;
		this.scoreForSecondTest = 0;
		this.scoreForThirdTest = 0;
	}

	public int getTestScore(int numberOfTest) {
		switch (numberOfTest) {
		case 1:
			return scoreForFirstTest;
		case 2:
			return scoreForSecondTest;
		case 3:
			return scoreForThirdTest;
		default:
		}
		return numberOfTest;
	}

	public void setTestScore(int numberOfTest, int score) {
		switch (numberOfTest) {
		case 1:
			scoreForFirstTest = score;
			break;
		case 2:
			scoreForSecondTest = score;
			break;
		case 3:
			scoreForThirdTest = score;
			break;
		default:
		}
	}

	public int avg() {
		return (this.scoreForFirstTest + this.scoreForSecondTest + this.scoreForThirdTest) / 3;
	}

	@Override
	public String toString() {
		return "Student{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", homeAddress="
				+ homeAddress + ", schoolAddress=" + schoolAddress + ", scoreForFirstTest=" + scoreForFirstTest
				+ ", scoreForSecondTest=" + scoreForSecondTest + ", scoreForThirdTest=" + scoreForThirdTest
				+ ", course=" + course + ", avg=" + avg() + '}';
	}
}
