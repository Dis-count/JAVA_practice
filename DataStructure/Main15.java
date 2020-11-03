import java.util.Arrays;

public class Main15 {
    public static void main(String[] args) throws Exception {
        int[] ary = {1,2,3,4,5,6};
        int[] ary1 = {1,2,3,4,5,6};
        int[] ary2 = {1,2,3,4};
        System.out.println("Is ary equal to array ary1? :"
        +Arrays.equals(ary, ary1));
        System.out.println("Is ary equal to array ary2? :"
        +Arrays.equals(ary, ary2));
    }
}
