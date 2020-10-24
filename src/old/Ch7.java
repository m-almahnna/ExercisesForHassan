package old;

public class Ch7 {
    public  static void walk(int start , int... nums){

        System.out.println(nums.length);
    }
    public static void main(String[] args) {
        walk(1);
        walk(1,2);
        walk(1,2,3);
        walk(1, new int[]{4,5,3,87,98});

    }


}
