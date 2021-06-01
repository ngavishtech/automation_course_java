package com.everc.oop;

public interface IEat {

    default void eat(){
        System.out.println("Animal eat!");
    }
}
