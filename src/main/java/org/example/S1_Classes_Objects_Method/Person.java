package org.example.S1_Classes_Objects_Method;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate DOB;
    private Address address;
    private Pet pet;
    private Person spouse;
    public static int[] nums;
    static{
        nums = new int[5];
        nums[0]  = 5;
        nums[1] = 5;
        nums[2] = 3;
        System.out.println(Arrays.toString(nums));

    }
//    public static int[] numsInitializer(){
//        nums = new int[5];
//        nums[0]  = 1;
//        nums[1] = 2;
//        nums[2] = 3;
//        return nums;
//    }

    public Person(String firstName, String lastName, LocalDate DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = DOB;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Person getSpouse() {
        return spouse;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", DOB=" + DOB +
                ", address=" + address +
                ", pet=" + pet +
                ", spouse=" + spouse +
                '}';
    }
    public static void main(String...args){
        System.out.println(Arrays.toString(Person.nums));
    }
}
