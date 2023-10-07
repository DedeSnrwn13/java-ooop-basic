public class ManagerApp {
    public static void main(String[] args) {
        
        Manager manager = new Manager();
        manager.name = "Dede";
        manager.sayHello("Budi");

        VicePresident vp = new VicePresident();
        vp.name = "Joko";
        vp.sayHello("Rudi");

    }
}
