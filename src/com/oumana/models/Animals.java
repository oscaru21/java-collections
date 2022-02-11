package com.oumana.models;

public class Animals implements Comparable<Animals>{
	private String name;
	private Long age;
	private Gender gender;
	
	

	public Animals(String name, Long age, Gender gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "\nname=" + name + ", age=" + age + ", gender=" + gender;
	}

	@Override
	public int compareTo(Animals o) {
		if(this.age == o.age)
			return 0;
		else if(this.age > o.age)
			return -1;
		else
			return 1;
	}
	
	
	
	
}
