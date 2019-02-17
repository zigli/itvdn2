package classes1;

public class NonStaticClass {
    public static final int X;
    static final  int Y = 20;

    static {
        X = 10;
        System.out.println("Static block X = " + X);
    }

    public NonStaticClass(){
        System.out.println("Constructor X = " + X);
    }
}
