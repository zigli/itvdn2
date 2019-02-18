package nested_classes2;


class MyClass {
    public class Inner extends BaseClass{
        public void methodFromInner(){
            System.out.println("Method from Inner class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Inner instance = new MyClass().new Inner();

        instance.methodFromBase();
        instance.methodFromInner();
    }
}
