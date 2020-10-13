public class Two {
    public static void main(String[] args) {
        String userEnter = " Welcome to Java 11";
        upperCase(userEnter);
        System.out.println(userEnter);
    }

    private static void upperCase(String userEnter) {
        int caseUpper = 0;

        for (int i = 0; i < userEnter.length(); i++) {
            if (isValue(userEnter.charAt(i)))
                ++caseUpper;
        }
        System.out.println("U=" + caseUpper);
    }

    private static boolean isValue(char c) {

        return (Character.isUpperCase(c));
    }
}
