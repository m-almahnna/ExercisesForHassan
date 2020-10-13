import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toNumm;
        int positives = 0;
        int negatives = 0;
        int totl = 0; //positives + negatives;
        //   int total = positives && negatives;
        final int ave = 2;
        System.out.print("number " + "");
        toNumm = scanner.nextInt();


        while (toNumm != 0) {

            if (toNumm < 0) {
                ++negatives;


            } else {
                ++positives;


            }
            totl += toNumm;
            System.out.print("number " + "");
            toNumm = scanner.nextInt();

            //  System.out.print(" N " + negatives);
            //   System.out.print(" P " + positives);


        }
        System.out.print(" \ntotal \nN=" + negatives + "\nP= " + positives);
        System.out.print("");
        System.out.print("ave " + (ave / positives + negatives));


    }

}
