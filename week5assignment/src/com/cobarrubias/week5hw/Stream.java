package com.cobarrubias.week5hw;

import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	/**
	 * Create a stream from the list of objects
	 * call stream functions (map, sort)
	 * collect and return the stream into a comma-separated list.
	 */
	
	public static void main(String[] args) {
		
		List<Animal> animals = Animal.animals;
		System.out.println(Sort(animals));
		
	}

	public static String Sort(List<Animal> animals) {
		List<Animal> animalList = animals;
		
		return animalList.stream()
				.map(Animal -> Animal.toString())
				.sorted()
				.collect(Collectors.joining(", "));
	}
	
}
