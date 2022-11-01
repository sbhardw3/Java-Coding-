
/**
 * Program calculates the batting average of starting line up of a team 
 * Shiven Bhardwaj
 * 02/05/2021
 */
import java.util.Scanner;
public class BattingAverage
{
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        // Reading at what position will the batter bat 
        // Calculating batting average of each player 
        // There are 9 players 
        int count;
         
        
        for (count = 1 ; count <= 9; count++) {
        
        // Asking the number of at bats    
        System.out.println("\nNumber of at bats of the player");
        double batAt = keyb.nextInt();
        
        // Asking the number of hits
        System.out.println("How many hits of the player");
        double hits = keyb.nextInt();
        
        // Calculating the batting average 
        double Average = hits / batAt;
        
        
        // Printing every result of the player 
        System.out.println("\nPlayer" + count + "\nAt bats: " + batAt +
                          "\nhits: " + hits +
                          "\nBatting Average:"+ Average);
        
                        
        }
        
        
        
        
       
        
        
        
    }
    
    
    
}
