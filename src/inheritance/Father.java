package inheritance;

public class Father {

    String fName;
    String LName;
    int id = 1900090000;

    public Father(String fName, String LName) {
        this.fName = fName;
        this.LName = LName;
    }
    public void display() {
        System.out.println(id);
    }

    public Father() {

    }
}
