package objects.inheritance;

public class InheritanceMain {
    
    public static void main(String... args) {
        Pet bird = new Pet("Bird");
        System.out.println(bird.type);

        Dog dog = new Dog("Mops");
        System.out.println(dog.type);
        System.out.println(dog.race);
        dog.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();
    }

}
