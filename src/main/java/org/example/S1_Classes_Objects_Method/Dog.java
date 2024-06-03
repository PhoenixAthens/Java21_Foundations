package org.example.S1_Classes_Objects_Method;

import java.time.LocalDate;

public class Dog extends Pet{
    public Dog(LocalDate DOB, String name) {
        super(DOB, name);
    }

    public void bark(){
        System.out.println("Wuff Wuff!");
    }
}
