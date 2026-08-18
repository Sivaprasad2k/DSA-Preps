package Exceptions;
import java.io.BufferedReader;
 // import java.io.InputStream;
import java.io.IOException;
// import java.util.Scanner;

import java.io.InputStreamReader;

public class InputOutput {
    public static void main(String x[]) throws IOException{

        System.out.println("Enter Number");
        InputStreamReader in  = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader( in);
           // Scanner sc = new Scanner(System.in);
           //  int num = sc.nextInt();

         int num = Integer.parseInt(bf.readLine());
         System.out.println("You entered: " + num);
         bf.close();


    }

}
