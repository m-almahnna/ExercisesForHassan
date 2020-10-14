package testing;

public class FinalTest {
    public static void main(String[] args) {
        // Modifiers.publicClass();
//        Modifiers.defaultClass();
//        Modifiers.protectedClass();

//        System.out.println(Modifiers.count);
//        Modifiers.main(new String[0]);

        Modifiers m = new Modifiers();
        System.out.println(Modifiers.count);
        Modifiers.count = 5;
        Modifiers modifiers = new Modifiers();
        Modifiers modifiers1 = new Modifiers();
        Modifiers.count = 6;
        System.out.println(Modifiers.count);
        System.out.println(Modifiers.count);
        System.out.println(Modifiers.count);// will be 6
        //System.out.println(mmmm.count);


        Modifiers.count = 10;
        Modifiers mmmm = new Modifiers();
        Modifiers.count = 234;
        m = null; // static needs to set it to change the value


        System.out.println(Modifiers.count);
        System.out.println(Modifiers.count);
        System.out.println(Modifiers.count);
        System.out.println(Modifiers.count);// will be 234

    }
}
