package objects.polymorphism;

public class CatChild extends PetParent {
    
    private String name;

    public CatChild(String name) {
        super("Cat");
        this.name = name;
    }

    @Override
    public void makeNoise() {
        log("Miau...");
    }

    public void jump() {
        log("Jump...");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
