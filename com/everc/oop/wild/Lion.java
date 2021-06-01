package com.everc.oop.wild;

public class Lion extends WildAnimal {

    @Override
    public void makeSound() {
        System.out.println("Lion sound!");
    }

    @Override
    public String toString() {
        return "Lion{} " + super.toString();
    }


}
