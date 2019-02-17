package classes3;

abstract class AbstractClass {
    public static void method(){
        System.out.println("AbstractClass.staticMethod");
    }
}

class DerivedClass extends AbstractClass{
    public static void method(){
        System.out.println("DerivedClass.staticMethod");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass.method();
        DerivedClass.method();
    }
}
