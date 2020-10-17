package inheritance;

public class Son extends Father {
    private String phone;

    public Son(String phone, String fName, String lName) {
        super(fName, lName);
        this.phone = phone;
    }

    public void display() {
      super.display();
    }
}
