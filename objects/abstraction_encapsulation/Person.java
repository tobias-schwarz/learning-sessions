package objects.abstraction_encapsulation;

public class Person {
    
    public String firstName;
    public String lastName;
    public int age;

    public String[] languages = new String[100];

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;
    }

    public Person(String firstName, String lastName, String motherTongue) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = 0;

        this.languages[0] = motherTongue;
    }

    public void greeting() {
        System.out.println("Hallo ich bin " + firstName + " " + lastName + " und ich bin " + age + " Jahre alt");
    }

    public void learnLanguage(String language) {
        for (int i = 0; i <= this.languages.length; i++) {
            if (this.languages[i] == null) {
                this.languages[i] = language;
                i = languages.length;
            }
        }
    }

    public void tellWhichLanguagesDoYouKnow() {
        this.greeting();
        System.out.println("Ich kenne folgende Sprachen:");

        for (String language : this.languages) {
            if (language != null) {
                System.out.println(language);
            }
        }
    }

    public int grewUp() {
        this.age++;

        return age;
    }

    public int grewUp(int age) {
        this.age = this.age + age;

        return age;
    }
    
}
