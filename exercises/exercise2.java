package exercises;

public class exercise2 {

    public static void main(String[] args) {

        /*
        Print the multiplication tables
         */



        System.out.println("*******************************");
        System.out.println("Multiplication table of ");
        System.out.println();

        for (int i = 1; i < 10; i++) {

            for (int j = 1; j <= 10; j++) {
                int result = i * j;

                System.out.println(i + " * " + j + " = " + result);
            }


        }
    }
}
