package com.everc.oop.domestic;

public class Dog extends DomesticAnimal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Gaf!");
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }
}
