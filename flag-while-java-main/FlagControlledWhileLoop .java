
package flag.controlled.pkgwhile.loop;

import java.util.Scanner;
    public class FlagControlledWhileLoop {

    
    
    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
       int value=0;
       boolean positive =true; 
       int sum=0;
       System.out.println("please enter positive numbers for addition");
       
       while(positive){
        value=input.nextInt();
            if(value>0) 
                sum+=value;
            else
                positive=false;
       }
    
           System.out.println("the addition results=" + sum);
    
    }
    
}
