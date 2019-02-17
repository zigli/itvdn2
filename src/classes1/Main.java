package classes1;

public class Main {
    public static void main(String[] args) {
        System.out.println(NonStaticClass.X);

        NonStaticClass instance = new NonStaticClass();
        NonStaticClass instance1 = new NonStaticClass();
        System.out.println(instance.X);
    }
}
