package Hw4;

public class Buyer {
    String name;
    String surName;
    Gender gender;

    public Buyer(String name, String surName, Gender gender) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
