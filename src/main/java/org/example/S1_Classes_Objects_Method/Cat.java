package org.example.S1_Classes_Objects_Method;

import java.time.LocalDate;

public class Cat extends Pet{
    public Cat(LocalDate DOB, String name) {
        super(DOB, name);
    }

    public void meow(){
        System.out.println("Meow Meow!");
    }
}
