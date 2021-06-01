package exercises;

public class exercise7 {

    public static void main(String[] args) {

        /*
        Print this shape on screen
         */

        System.out.println("*******************************");
        System.out.println("Here is a shape");
        System.out.println();

        for (int i = 0; i <= 4; i++) {
            for (int m = 0; m <= i; m++) {
                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
