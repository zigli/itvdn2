package nested_classes;

class MyClass{
    private static int field;

    public class Inner{
        public void method(int a){
            field = a;

            System.out.println("Method in Inner class, with field = " + field);
        }
    }
    public void method(){
        System.out.println("Method in Outer class");
    }
}


public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method(2);

        MyClass instance1 = new MyClass();
        instance1.method();
    }
}
