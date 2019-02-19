package nested_classes4;

class MyClass{
    public static class Nested{
        void say(){
            System.out.println("hello");
        }
        public static void staticMethodFromNested(){
            System.out.println("Static Method From Nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested.staticMethodFromNested();
        MyClass.Nested instance = new MyClass.Nested();
        instance.say();
    }
}
