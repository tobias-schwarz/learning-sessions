package objects.polymorphism;

public class PolyMain {

    public static void main(String... args) {
        PetParent[] zoo = {
            new PetParent("Bird"),
            new PetParent("Rabbit"),
            new DogChild("Mops"),
            new CatChild("Kitty")
        };

        for (PetParent pet : zoo) {
            pet.makeNoise();
            System.out.println(pet.getType());
        }
    }
    
}
