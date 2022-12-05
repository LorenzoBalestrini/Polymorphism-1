package it.develhope.polymorphism;

public class Test {
    public static void main(String[] args) {

        Animal lion = new Animal("Lion");

        lion.animalSound();
        System.out.println("-------------");
        lion.animalSound("High");
        System.out.println("-------------");
        lion.animalSound("Low");
        System.out.println("-------------");
        lion.animalSound(" ");
    }
}
