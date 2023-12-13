

package javaapplication2 ;
 import java.util.Scanner;
public class ar {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
       int L,W,A;
       System.out .println("enter length");
       L=input.nextInt();
       System.out .println("enter width");
       W=input.nextInt();
       A=L*W;
       System.out.printf("the area of rectangle = %d",A );
       
               
    }
    
}
