package com.everc.oop.domestic;

public class Cat extends DomesticAnimal {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Myay!");
    }

    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }
}
