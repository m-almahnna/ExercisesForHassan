package outOfPackageTest;

import testing.Modifiers;

import static testing.Modifiers.publicClass;

public class NextTest {
    public static void main(String[] args) {
        publicClass();
        Modifiers.publicClass();

    }
}
