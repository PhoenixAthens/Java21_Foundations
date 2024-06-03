package org.example.S4_RegularExpression;

public class Basics_P1 {
    public static void main(String... args) {
        //learning about negation, ranges, and particular characters!
        var animal = "Cat";
        var place  = "flat";
        var animal_lower = "cat";
        System.out.println(animal.matches("Cat"));//true
        System.out.println(animal.matches("cat"));//false
        System.out.println(animal.matches("[Cc]at"));//true
        System.out.println(place.matches("[a-z]lat"));//true
        System.out.println(place.matches("[a-zA-Z][a-z]at"));//true
        System.out.println(place.matches("[d-g][i-m][a-b][t-z]"));//true
        System.out.println(animal.matches("[^a-z]at"));//true
        System.out.println(animal_lower.matches("[^a-z]at"));//false
        System.out.println(animal.matches("[^a-zC]at"));//false

    }
}
