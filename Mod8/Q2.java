
/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Q2
{
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("Enter speed: ");
        double s = keyb.nextDouble();
        
        System.out.println("Enter hours: ");
        int t = keyb.nextInt();
        
        
        
        System.out.println("Hours" + "\tDistance");
        System.out.println("---------------------");
        
        int hr = 1;
        
        while(t >= 1){
            System.out.println(t + "\t" + s*t);
            hr++;
            t--;
        }
        
        
    }
}
