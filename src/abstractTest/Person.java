package abstractTest;

abstract class Person {

    public Person() {
    }

    public abstract String getName();

    public void preintName(){
        System.out.println(getName());
    }
}
