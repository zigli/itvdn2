package nested_classes1;

class MyClass{
    private int field;

    public class Inner{
        MyClass instance = new MyClass();

        public void method(int a){
            instance.field = a;

            System.out.println("Method in Inner class, with field = " + instance.field);
        }
    }
}


public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();
        instance.method(2);

    }
}
