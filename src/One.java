public class One {

    public static void main(String[] args) {
        //       Scanner scanner=new Scanner(System.in);
        String mo = "Mohammed";
        System.out.println(mo);

        countVowels(mo);
    }

    private static void countVowels(String mo) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < mo.length(); i++) {
            if (isVowel(mo.charAt(i))) {
                ++vowelCount;
            } else {
                ++consonantCount;
            }
        }

        System.out.println("V ==" + vowelCount);
        System.out.println("C ==" + consonantCount);
    }

    private static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'o' || ch == 'e');
    }

}
