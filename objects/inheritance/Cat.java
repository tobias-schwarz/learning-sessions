package objects.inheritance;

public class Cat extends Pet {

    public Cat() {
        super("Cat");
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau...");
    }

}
