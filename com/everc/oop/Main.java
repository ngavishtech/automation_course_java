package com.everc.oop;

import com.everc.oop.domestic.Cat;
import com.everc.oop.domestic.Cow;
import com.everc.oop.domestic.Dog;
import com.everc.oop.domestic.DomesticAnimal;
import com.everc.oop.wild.Falcon;
import com.everc.oop.wild.Lion;
import com.everc.oop.wild.WildAnimal;
import com.everc.oop.wild.Wolf;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Animal cat1 = new Cat("Pupu");
        Animal dog = new Dog("Frufru");
        Animal lion = new Lion();
        Animal falcon = new Falcon();

        Animal wolf1 = new Wolf();
        WildAnimal wolf2 = new Wolf();
        wolf2.setHabitat("forest");
        Wolf wolf3 = new Wolf();

        Cow cow1 = new Cow();
        cow1.setName("muwka");
        cow1.setPredator(false);
        Eyes eyes = new Eyes();
        eyes.setColor(Color.BLUE);
        eyes.setShape("narrow");
        cow1.setEyes(eyes);

        Animal cow2 = new Cow("burenka");

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog);
        animals.add(lion);
        animals.add(wolf1);
        animals.add(falcon);
        animals.add(cow1);

        for (Animal animal : animals) {
            System.out.println(animal.getClass().getSimpleName());
            System.out.println(animal.toString());
            animal.makeSound();
            animal.eat();
            System.out.println();
        }

    }
}
