package objects.abstraction_encapsulation;

public class AbstractionEncapsulationMain {
    
    public static void main(String... args) {
        Person tobi = new Person("Tobias", "Schwarz");

        tobi.greeting();

        tobi.firstName = "Tobi";
        System.out.println(tobi.firstName);

        System.out.println(tobi.age);
        tobi.grewUp();
        System.out.println(tobi.age);
        
        Person thomas = new Person("Thomas", "Pohl");
        System.out.println(thomas.firstName);
    }

}
