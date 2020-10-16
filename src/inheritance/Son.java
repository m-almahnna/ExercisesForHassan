package inheritance;

public class Son extends Father { // i have error here cannot access
    int phone;

    public Son(int phone,String fName, String LName) {
       super(fName,LName);
        this.phone = phone;
    }
}
