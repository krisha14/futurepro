package com.generalprojects;

public class Animal {
    int eyes;

    protected String animalName = "Mouse";
    public static void main(String[] args){
        Animal animalObj = new Animal();
        animalObj.eyes = 2;
        int a = 2;
        changePrimitives(a);

        System.out.println("value of a " + a);
        System.out.println("Animal has " + animalObj.eyes);
    }

    public static void changePrimitives(int aCopy){
        aCopy = 13;
    }
}
