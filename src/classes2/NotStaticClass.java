package classes2;

import classes.NonStaticClass;

public class NotStaticClass {
    static  int x;

    static {
        x = 1;
        System.out.println("Static block x = " + x);
    }
    static {
        x = 23;
        System.out.println("Static block x = " + x);
    }
    static {
        x = -99;
        System.out.println("Static block x = " + x);
    }

    NotStaticClass(int x){
        this.x = x;
        System.out.println("Constructor x = " + x);
    }
}
