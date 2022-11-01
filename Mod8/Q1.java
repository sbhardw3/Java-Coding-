
/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;


public class Q1
{
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        
        
        int d = 0;
        
        System.out.println("Enter digit: ");
        int a = keyb.nextInt();
        
        int sum = a*((a+1)/2);
        
        int avg = sum/a;
        
        System.out.println(sum);
        System.out.println(a);
        System.out.println(avg);
        
    }
  
}
