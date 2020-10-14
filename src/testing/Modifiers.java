package testing;

public class Modifiers {
    public Modifiers() {
    }

    public static int count = 9;

    public static void main(String[] args) {
//        privateClass();
//        protectedClass();
//        publicClass();
//        defaultClass();

        //  System.out.println(count);
    }

    public static void publicClass() {
        System.out.println("public Class");
    }

    private static void privateClass() {
        System.out.println("Private Class");
    }

    protected static void protectedClass() {
        System.out.println("Protected Class");
    }

    static void defaultClass() {
        System.out.println("Default Class");

    }
}
