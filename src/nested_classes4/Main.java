package nested_classes4;

class MyClass{
    public static class Nested{
        public static void staticMethodFromNested(){
            System.out.println("Static Method From Nested class");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested.staticMethodFromNested();
    }
}
