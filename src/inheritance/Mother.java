package inheritance;

public class Mother {
    public static void main(String[] args) {
        Son son = new Son(23, "mohammed", "almahnna");
//        System.out.println(son.fName);
//        System.out.println(son.LName);
//        System.out.println(son.phone);
//
//        System.out.println(son.toString());
        System.out.println("M");

        son.display();

    }
}
