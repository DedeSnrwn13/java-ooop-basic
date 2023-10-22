public class ManagerApp {
    public static void main(String[] args) {
        
        Manager manager = new Manager("Dede");
        manager.sayHello("Budi");

        VicePresident vp = new VicePresident("Joko");
        vp.sayHello("Rudi");

    }
}
