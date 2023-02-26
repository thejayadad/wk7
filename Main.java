import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Beat", "Huge", 800);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
        Dog yorkie = new Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");
        Dog retriever = new Dog("Labrador Retriever", 65, "Floopy", "Swinner");
        doAnimalStuff(retriever, "slow");
        Dog wolf = new Dog("Wolk", 40);
        doAnimalStuff(wolf,"slow");

        Fish goldie = new Fish("GoldFish", 1, 2, 3);
        doAnimalStuff(goldie,"fast");

    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }
}
