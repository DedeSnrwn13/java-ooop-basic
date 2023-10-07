class Person {
    String name;
    String address;
    final String country = "Indoneisa";

    void sayHello(String paramName) {
        System.out.println("Hello " + paramName + ", My Name is " + name);
    }
}