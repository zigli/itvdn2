package nested_classes3;


class MyClass extends BaseClass{
    public class Inner{
        public void methodFromInner(){
            System.out.println("Method from Inner class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance = new MyClass();
        instance.methodFromBase();

        MyClass.Inner instance1 = new MyClass().new Inner();
        instance1.methodFromInner();
    }
}
