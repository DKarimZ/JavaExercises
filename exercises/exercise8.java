package exercises;

public class exercise8 {

    public static void main(String[] args) {

        /*
        Draw a shape on screen
         */

        System.out.println("*******************************");
        System.out.println("Here is a shape");
        System.out.println( );

        for(int i = 4;i>=0;i--){
            for(int l = 0;l<=4;l++){
                if(l<i) System.out.print("  ");
                else System.out.print(" *");

            }
            System.out.println();
        }
    }
}
