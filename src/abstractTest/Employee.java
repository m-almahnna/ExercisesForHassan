package abstractTest;

public class Employee extends Person {
    public String getName() {
        return "Mohammed";
    }

    public static void main(String[] args) {
        new Employee().preintName();
    }
}
