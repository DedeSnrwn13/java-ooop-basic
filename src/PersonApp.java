public class PersonApp {
    public static void main(String[] args) {
        
        Person person1 = new Person();
        person1.name = "Dede";
        person1.address = "Jakarta";

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        Person person2 = new Person();
        Person person3;
        person3 = new Person();
    }
}
