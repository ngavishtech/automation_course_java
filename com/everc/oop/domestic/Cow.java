package com.everc.oop.domestic;

public class Cow extends DomesticAnimal {

    public Cow(String name) {
        super(name);
    }

    public Cow() {
        super();
    }

    @Override
    public void makeSound() {
        System.out.println("Mu-u-u!");
    }

    @Override
    public void eat(){
        System.out.println("Cow eat grass!");
    }

    @Override
    public String toString() {
        return "Cow{} " + super.toString();
    }
}
