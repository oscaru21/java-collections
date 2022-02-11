package com.oumana.implementations.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.oumana.models.Animals;
import com.oumana.models.Gender;

public class HashTableImp {

	public static void main(String[] args) {
		//test animals declaration
		Animals dog = new Animals("dog", 5L, Gender.MALE);
		Animals cat = new Animals("cat", 3L, Gender.FEMALE);
		Animals cow = new Animals("cow", 10L, Gender.FEMALE);
		Animals dolphin = new Animals("dolphin", 4L, Gender.MALE);
		Animals shark = new Animals("shark", 6L, Gender.MALE);
		//HashTable declaration
		Map<Integer, Animals> animals = new Hashtable<>();
		
		//add
		animals.put(1, dog);
		animals.put(4, dolphin);
		animals.put(5, shark);
		animals.put(2, cat);
		animals.put(3, cow);
		//add repeated element
		animals.put(6, shark);
		//add null element
		try {
			animals.put(7, null);
		} catch (Exception e) {
			System.out.println("HashTable does not allow null values");
		}		
		System.out.println(animals);
		System.out.println("----------------------------------------");
		//remove by index
		animals.remove(6);
		System.out.println(animals);
		System.out.println("----------------------------------------");
		//update
		animals.replace(1, cat);
		System.out.println(animals);
		System.out.println("----------------------------------------");
		//iterate
		//for loop
		for(Entry<Integer, Animals> animal: animals.entrySet()) {
			System.out.println(animal);
		}
		System.out.println("----------------------------------------");
		//forEach
		animals.entrySet().forEach(System.out::println);
		System.out.println("----------------------------------------");
		//with iterator
		
		Iterator<Entry<Integer, Animals>> iterator = animals.entrySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------------------------------------");	
		// TODO Auto-generated method stub

	}

}
