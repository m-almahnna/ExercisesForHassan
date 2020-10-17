package inheritance;

public class Father {

    private String fName;
    private String lName;
    int id = 1900090000;

    public Father() {

    }

    public Father(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
    }

    public void display() {
        System.out.println(id);
    }
}
