package com.oumana.implementations.set;

import java.util.LinkedHashSet;
import java.util.Set;

import com.oumana.models.Animals;
import com.oumana.models.Gender;

public class LinkedHashSetImp {

	public static void main(String[] args) {
		//test animals declaration
		Animals dog = new Animals("dog", 5L, Gender.MALE);
		Animals cat = new Animals("cat", 3L, Gender.FEMALE);
		Animals cow = new Animals("cow", 10L, Gender.FEMALE);
		Animals dolphin = new Animals("dolphin", 4L, Gender.MALE);
		Animals shark = new Animals("shark", 6L, Gender.MALE);
		//LinkedHashSet declaration
		Set<Animals> animals = new LinkedHashSet<>();	
		
		//add
		animals.add(dog);
		animals.add(cat);
		animals.add(cow);
		animals.add(dolphin);
		animals.add(shark);
		//add repeated element
		animals.add(dolphin);
		System.out.println(animals);
		System.out.println("----------------------------------------");
		//remove
		animals.remove(dog);
		System.out.println(animals);
		System.out.println("----------------------------------------");
		//update
		for(Animals animal : animals)
	        if(animal.equals(cat)) {
	            animals.remove(cat);
	            animals.add(dog);
	            break;
	        }
		System.out.println(animals);
		System.out.println("----------------------------------------");
		//iterate
		//for loop
		for(Animals animal: animals) {
			System.out.println(animal);
		}
		System.out.println("----------------------------------------");
		//forEach
		animals.forEach(System.out::println);
	}

}
