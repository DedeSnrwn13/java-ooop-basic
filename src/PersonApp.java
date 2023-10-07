public class PersonApp {
    public static void main(String[] args) {
        
        Person person1 = new Person("Dede", "Jakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Joko");

        Person person2 = new Person("Budi", "Bandung");

        Person person3;
        person3 = new Person("James", "Solo");
        person3.sayHello("Budi");
    }
}
