package exercises;

public class exercise1 {
    public static void main(String[] args) {

        /*
        Print the multiplication table for 5 Using what you have learnt above, print the multiplication table
        5 x 1 = 5
        5 x 2 = 10
        ...
        */

        System.out.println("*******************************");
        System.out.println("Multiplication table of 5");


        for (int i = 1; i <= 10; i++) {
            int result = 5 * i;
            System.out.println("5 * " + i + " = " + result);
        }

    }
}
