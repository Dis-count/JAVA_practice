public class Rect {
    public static void main(String[] args) {
         //outer loop every time print a line of *
        for (int i = 1; i <= 5; i++) {
            System.out.print("*");
            //inner loop every time print a *
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
