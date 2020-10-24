package Interface;

public class InterfaceEx implements Human {
    public static void main(String[] args) {
        InterfaceEx interfaceEx = new InterfaceEx();
        interfaceEx.username();
    }

    @Override
    public void username() {
        System.out.println(admin);
        System.out.println(password);
    }


    @Override
    public void username1() {

    }

    @Override
    public void username2() {

    }
}
