package it.develhope.polymorphism;

public class Animal {

    private String animalName;
    public Animal (String name){
        this.animalName = name;
    }

    public void animalSound(){
        System.out.println("Roarr!");
    }

    public void animalSound(String intensity){
        if(intensity == "High"){
            System.out.println("Roarrrrrrrr!");
        }else if(intensity == "Low"){
            System.out.println("Roar");
        }else{
            System.out.println("Cannot reproduce it properly");
        }
    }

}
