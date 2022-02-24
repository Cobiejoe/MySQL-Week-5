package com.cobarrubias.week5hw;

import java.util.ArrayList;
import java.util.List;

public class Animal {
	
	/**
	 * Class creation, instance variable declaration, create getter/setter.
	 * compare method that returns whether or not first parameter is greater and second.
	 * Static list used in sort methods in SortedAnimals.java.
	 *toString method gives us visual representation of our objects and names.
	 */

	private String name;
	
	public static List<Animal> animals = new ArrayList<>(List.of(new Animal("Cat"), new Animal("Dog"),
			new Animal("Monkey"), new Animal("Cheetah"), new Animal("Elephant")));
	
	
	public Animal(String name) {
		this.setName(name);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static int compare(Animal a1, Animal a2) {
		return a1.name.compareTo(a2.name);
	}

	@Override
	public String toString() {
		return "Animal [" + name + "]";
	}

}
