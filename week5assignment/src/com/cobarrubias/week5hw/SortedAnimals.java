package com.cobarrubias.week5hw;

import java.util.List;

public class SortedAnimals {
	
	public static void main(String[] args) {
		
		List<Animal> lambdaList = lambdaSort(Animal.animals);
		System.out.println(lambdaList);
		
		List<Animal> methodRefList = methodRefSort(Animal.animals);
		//System.out.println(methodRefList);
		
	}
	
	// sort using lambda expression
	public static List<Animal> lambdaSort(List<Animal> animals) {
		
		List<Animal> animalList = animals;
		animalList.sort((a1, a2) -> Animal.compare(a1, a2));
		
		return animalList;
	}
	
	// sort using method reference
	public static List<Animal> methodRefSort(List<Animal> animals) {
		List<Animal> animalList = animals;
		animalList.sort(Animal::compare);
		
		return animalList;
	}
	
}
