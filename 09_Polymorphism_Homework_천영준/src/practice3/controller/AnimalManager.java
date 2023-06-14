package practice3.controller;

import java.util.Random;

import package3.model.vo.Animal;
import package3.model.vo.Cat;
import package3.model.vo.Dog;

public class AnimalManager {

	public static void main(String[] args) {
		Animal[] animals = new Animal[5];
		Random random = new Random();
		
		for(int i = 0; i < animals.length; i++) {
			int randomNumber = random.nextInt(2);
			
			if(randomNumber == 0) {
				animals[i] = new Dog();
			} else {
				animals[i] = new Cat();
			}
		}
		for(Animal animal : animals) {
			animal.speak();
		}
	}

}
