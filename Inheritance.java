
class Parent {

    Parent() {
        System.out.println("I am the parent");
    }
}

class Child extends Parent {

    Child() {
        // super();
        System.out.println("I am the Child");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Child ch = new Child();
    }
}
