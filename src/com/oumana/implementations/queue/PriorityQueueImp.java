package com.oumana.implementations.queue;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import com.oumana.models.Animals;
import com.oumana.models.Gender;

public class PriorityQueueImp {
	public static void main(String[] args) {
		//test animals declaration
		Animals dog = new Animals("dog", 5L, Gender.MALE);
		Animals cat = new Animals("cat", 3L, Gender.FEMALE);
		Animals cow = new Animals("cow", 10L, Gender.FEMALE);
		Animals dolphin = new Animals("dolphin", 4L, Gender.MALE);
		Animals shark = new Animals("shark", 6L, Gender.MALE);
		//PriorityQueue declaration
		Queue<Animals> animals = new PriorityQueue<>();
		
		//add
		animals.offer(dog);
		animals.offer(cat);
		animals.offer(cow);
		animals.offer(dolphin);
		animals.offer(shark);
		//add repeated element
		animals.offer(dolphin);
		System.out.println(animals);
		System.out.println("----------------------------------------");
		//remove the head of the queue
		animals.poll();
		animals.poll();
		//remove by name
		animals.remove(dolphin);
		System.out.println(animals);
		System.out.println("----------------------------------------");
		//update
		//replace first element (cat) with dog
		for(Animals animal : animals)
	        if(animal.equals(cat)) {
	            animal.setAge(20L);
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
		System.out.println("----------------------------------------");
		//with iterator
		
		Iterator<Animals> iterator = animals.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("----------------------------------------");		
	}
}
