import personPack.Person;

public class PersonDriver {

    public static void main(String[] args) {
       Person Jude = new Person();
        System.out.println(Jude);

        Person Nick = new Person("Nick", 18);
        System.out.println(Nick);


        if(Jude.getName().equals(Nick.getName()) && Jude.getAge() == Nick.getAge()) {
            System.out.println("Both people have the same name and age.");
        } if (Jude.getAge()<Nick.getAge()) {
            System.out.println("Nick is older than Jude.");
        } if (Jude.getAge()>Nick.getAge()) {
            System.out.println("Jude is older than Nick.");
        } if (Jude.getName().equals(Nick.getName()) == false) {
            System.out.println("Nick and Jude do not have the same names, but they are the same age.");
        }

    }

}
