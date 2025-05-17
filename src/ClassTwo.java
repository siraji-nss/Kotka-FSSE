public class ClassTwo {
    public static void main(String[] args) {

        /*
        * Conditional Statement
        * 1. If-else
        * 2. Switch case
        * */


        /*
        int a =7;

        if(a == 5){
            System.out.println("Five");
        }else if(a == 6){
            System.out.println("Six");
        }else {
            System.out.println("None");
        }
         */

        int a = 13;
        //a = 10;
        if(a % 2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }


        int year = 2100;
        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }





    }
}
