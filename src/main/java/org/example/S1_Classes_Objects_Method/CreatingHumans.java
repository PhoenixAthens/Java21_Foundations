package org.example.S1_Classes_Objects_Method;

import java.time.LocalDate;


public class CreatingHumans {
    public static void main(String... args){
        Person hub = new Person("Jacob","Dennings", LocalDate.of(1995,10,12));
        Person wifi = new Person("Martha","Stacy",LocalDate.of(1994,12,29));
        hub.setSpouse(wifi);
        Pet doggo = new Dog(LocalDate.of(2023,12,28),"Raspberry");
        hub.setPet(doggo);
        Address address = new Address("K2","128","1290","Downtown","Manhattan","New York","United States");
        hub.setAddress(address);
        System.out.println(hub);
    }
}
