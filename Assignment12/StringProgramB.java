import java.util.Scanner;

public class StringProgramB
{
   public static void main(String[] args){
       Scanner keyb = new Scanner(System.in);
       // Creating strings
       String s = new String();
       
       int counter = 0;
       
       //Asking the user to enter a valid line of text
       System.out.println("Enter text: ");
       s = keyb.nextLine();
       
       
      
       // If the user doesn't enter the end 
       while (!s.equalsIgnoreCase("The end")){
              
              //Searching the word 'is' in the text entered by the user
              if (s.indexOf("is") != -1)  { 
                  counter++;
              
              }
              
              // Asking the user again to enter text
              System.out.println("Enter text: ");
              s = keyb.nextLine();
       }
       
       // Printing the number of lines that has the word 'is'
       System.out.println(counter);
        
       
   }
}
       
       
   

