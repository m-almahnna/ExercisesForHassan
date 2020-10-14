public class Rookie {
    private String name = "Static class";

    public static void first() {
    }

    public static void second() {
    }

    public static void third1() {
        System.out.println(new Rookie().name);
    }

    public static void main(String[] args) {
        first();
        second();
        third1();


    }

    public void third() {
        System.out.println(name);
    }
}
