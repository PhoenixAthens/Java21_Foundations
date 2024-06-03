package org.example.S1_Classes_Objects_Method;

import java.time.LocalDate;

public class Pet {
    private LocalDate DOB;
    private String name;

    public Pet(LocalDate DOB, String name) {
        this.DOB = DOB;
        this.name = name;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "DOB=" + DOB +
                ", name='" + name + '\'' +
                '}';
    }
}

