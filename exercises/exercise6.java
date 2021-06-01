package exercises;

public class exercise6 {
    public static void main(String[] args) {

        /*
        Print the chess board. print 'w' for white and 'b' for black, it should look like this
         */

        System.out.println("*******************************");
        System.out.println("Here is the chess board");
        System.out.println();


        int j = 7 * 7;
        for (int i = 0; i <= j; i++) {

            System.out.print(i % 2 == 0 ? 'b' : 'w');
            if (i % 7 == 0) System.out.println("");

        }


    }

}
