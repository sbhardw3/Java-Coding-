import java.util.Scanner;

public class StringProgramC
{
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        
        // Contsructing the strings 
        
        String s = new String(); 
        String d = new String();
        
        int count = 0;
        
        // Asking the user to enter text
        System.out.println("Enter text: ");
        s = keyb.nextLine();
        
        // if the text is equal to 'the end' then the program stops asking text
        while (!s.equalsIgnoreCase("The end")){
            
            //Finding the where the word 'is' is in the text
            int i = s.indexOf("is");
            
            // Finding the occurence of 'is' and changing it with 'was'
            while (i != -1){
                d = s.substring(0, i);
                d = d.concat("was");
                d = d.concat(s.substring(i+2));
                
                // Check if there is more occurence of 'is' in the text
                // and changing it into 'was'
                s = d;
                
                i = s.indexOf("is");
                
                count++;
                
            }
            
            //Printing the text with changes 
            System.out.println("\'" + s + "\'");

            //Asking the user again to enter text
            System.out.println("Enter text: ");
            s = keyb.nextLine();
        }
        
        
        // Prinintng the number made from changing 'is' to 'was'
        System.out.println(count);
    }
}