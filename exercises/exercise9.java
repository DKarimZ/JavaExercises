package exercises;

public class exercise9 {

    public static void main(String[] args) {

        /*
        Print a triangle on the screen
         */

        System.out.println("*******************************");
        System.out.println("Here is a triangle");
        System.out.println("");

        for(int i=0;i<5;i++){

            int n=0;
            while(n<4-i){System.out.print(" ");n++;}
            for(int m=0;m<=i;m++){System.out.print(" *");};


            System.out.println("");
        }

    }

}
