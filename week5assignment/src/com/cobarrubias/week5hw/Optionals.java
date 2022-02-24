package com.cobarrubias.week5hw;

import java.util.NoSuchElementException;
import java.util.Optional;

public class Optionals {
	
	/**
	 * checkAnimal method accepts an optional of Animal and returns
	 * unwrapped object.
	 * method b checks first method and catches exception
	 */

	public static void main(String[] args) {
		
		methodB("Bear");
		
	}
	
	public static Animal animalMethod(Optional<Animal> optionalAnimal) {
		
		return optionalAnimal.orElseThrow(() -> new NoSuchElementException("Animal not found :("));
		
	}
	
	public static void methodB(String animal) {
		Animal checkAnimal = animalMethod(Optional.of(new Animal(animal)));
		System.out.println(checkAnimal);
		try {
			animalMethod(Optional.empty());
		} catch (NoSuchElementException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
