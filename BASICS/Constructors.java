import java.util.*;
public class Constructors{

    public static void main(String[] args){

        int i , j ;
        int n = 4;
         for (i = 1; i <= n; i++) {
            
            // inner loop to print the spaces
            for (j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // inner loop to print the first part
            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // inner loop to print the second part
            for (j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }

         
    }

}