import java.util.Scanner;

public class StringProgramA
{
   public static void main(String[] args){
       Scanner keyb = new Scanner(System.in);
       String s = new String();
       
       
       System.out.println("Enter a line of text: ");
       s = keyb.nextLine();
      
       while(!s.equals("The end")){
           System.out.println("Enter a line of text: ");
           s = keyb.nextLine();
           
           System.out.println(s);
           
           if (s.equals("The end")){
               System.exit(0);
            }
        }
           

   }
   
}
