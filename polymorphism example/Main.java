public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal(); //create a animal object
        Animal myPig = new Pig(); //create a pig object
        Animal myDog = new Dog(); //create a dog object

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
