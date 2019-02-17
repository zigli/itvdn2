package nested_classes;

import com.sun.deploy.security.MozillaMyKeyStore;

class MyClass{
    public class Inner{
        public void method(){
            System.out.println("Method in Inner class");
        }
    }
    public void method(){
        System.out.println("Method in Outer class");
    }
}


public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method();

        MyClass instance1 = new MyClass();
        instance1.method();
    }
}
