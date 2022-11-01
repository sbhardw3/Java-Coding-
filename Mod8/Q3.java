
/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Q3
{
   public static void main(String[] args){
       Scanner keyb = new Scanner(System.in);
       
       System.out.println("Enter a num: ");
       int num = keyb.nextInt();
       
       for(int i = 1; i <= num; i++){
           for(int j = num; j >= 1; j--){
               System.out.println("%");
            }
            System.out.println();
        }
           
           
    }
}

