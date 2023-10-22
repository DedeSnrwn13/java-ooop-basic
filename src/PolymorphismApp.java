public class PolymorphismApp {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Dede");
        employee.sayHello("Budi");

        employee = new Manager("Dede");
        employee.sayHello("Budi");

        employee = new VicePresident("Dede");
        employee.sayHello("Budi");

        sayHello(new Employee("Dede"));
        sayHello(new Manager("Rudi"));
        sayHello(new VicePresident("Ridho"));
    }

    static void sayHello(Employee employee) {
        System.out.println("Hello " + employee.name);
    }
}
