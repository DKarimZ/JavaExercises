package exercises;

public class exercise10 {

    public static void main(String[] args) {

        /*
        Print the triangle upside down
         */

        System.out.println("*******************************");
        System.out.println("Here is a triangle upside down");
        System.out.println();

        for(int i = 0;i<=5;i++) {
            System.out.println("");
            for (int p = 5; p >= 0; p--) {
                if (p >= 5 - i) System.out.print(" ");
                else System.out.print(" *");
            }
        }
    }
}
