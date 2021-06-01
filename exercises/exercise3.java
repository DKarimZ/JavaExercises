package exercises;

public class exercise3 {

    public static void main(String[] args) {

        /*For numbers from 1 to 20, if the number is divisible by 3 print "Fizz"
         if it is divisible by 5 print "Buzz". If it is divisible by 3 and 5 print "FizzBuzz"
         */

        System.out.println("*******************************");
        System.out.println("Welcome to fizzBuzz");
        System.out.println();


        for (int i = 1; i <= 20; i++) {

            String word = i % 3 == 0 ? "fizz" : "";
            System.out.println(word += i % 5 != 0 ? "" : "buzz");


        }
    }
    }
