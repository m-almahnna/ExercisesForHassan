package inheritance;

public class Son extends Father {
    int phone;

    public Son(int phone, String fName, String LName) {
        super(fName, LName);
        this.phone = phone;
    }

    public void display() {
      super.display();
    }
}
