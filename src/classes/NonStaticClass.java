package classes;

public class NonStaticClass {
    private int Id;
    public static int field;

    public NonStaticClass(int Id){
        this.Id = Id;
    }

    public void nonStaticMethod (){
        System.out.println("Instance{0}.field = " + Id + ", " + field);
    }

    public static void staticMethod(){
        System.out.println("Can not invode non-static field");
    }
}
