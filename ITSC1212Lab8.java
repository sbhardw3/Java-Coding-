import java.util.Scanner;

public class ITSC1212Lab8 {
    
    static int randomX = 0;
    static int randomY = 0;
    static World w = new World(500,500);

    public static void main(String[] args) throws InterruptedException{
        randomX = ((int)(Math.random()*100))*5;
        randomY = ((int)(Math.random()*100))*5;

        Turtle tom = new Turtle(randomX, randomY,w);
        tom.setVisible(false);
        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter A guess for the X position of Tom: ");
        int guessX = scnr.nextInt();

        System.out.println("Enter A guess for the Y position of Tom: ");
        int guessY = scnr.nextInt();

        while((guessX != randomX) || (guessX != randomY)){

            if(guessX != randomX){
                System.out.println("Incorrect Value of X Enter again: ");
                guessX = scnr.nextInt();
            }
            if (guessX == randomX){
                System.out.println("You got it Right!");
            }
            else if (guessX > randomX){
                System.out.println("Too high");
            }
            else{
                System.out.println("Too low");
            }

            if(guessY != randomY){
                System.out.println("Incorrect Value of Y Enter again: ");
                guessY = scnr.nextInt();
            }
            if (guessY == randomY){
                System.out.println("You got it Right!");
            }
            else if (guessY > randomY){
                System.out.println("Too high");
            }
            else{
                System.out.println("Too low");
            }

            /* 12) The while loop is more appropiate because we are 
            using boolean expression here. It can also be done by a for loop
            but it will get complicated
            *
            *
            * 13) We used OR in the while because we want one of the statement 
            to be true for the while loop to get executed. If we use AND then both of the
            statement must be true for the while loop to get executed.
            */
                 
        }

        System.out.println("You found the Turtle!!!!");
        tom.setVisible(true);
        scnr.close();

        
        
    }


}
