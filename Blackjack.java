import java.util.Scanner;

public class Blackjack{

    public static void main(String[] args){

        Deck deck = new Deck();
        Scanner scnr = new Scanner(System.in);
        
        

        int houseTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        int playerTotal = deck.drawCard().getValue(true) + deck.drawCard().getValue(true);
        

        System.out.println("Enter 'p' to play the game");
        String game = scnr.nextLine();
        
        while(game == "p"){
        System.out.println("The House is showing: " + houseTotal);

        while (playerTotal <= 21){

            Thread.sleep(100);
            System.out.println("Player is showing: " + playerTotal);
            System.out.print("Would you like to hit or Stand?\n\tEnter 1 for hit or 0 for stand:");
            int choice = scnr.nextInt();

            if(choice == 0){
                break;
            } else if (choice == 1){
                Card nextCard = deck.drawCard();
                System.out.println("Player draws the " + nextCard.declareCard());
                playerTotal += nextCard.getValue(true);
            } else {
                System.out.println("Invalid option, try again");
            }

        }

        if (playerTotal > 21){
            System.out.println("The Player has busted!");
        } else {
            System.out.println("\nThe Player stands with " + playerTotal + " points.");
            System.out.println("The House will play next.");
        }
        
        while (houseTotal <= 21){

            System.out.println("House is showing: " + houseTotal);

            if(houseTotal < 17){
                break;
            } else if (houseTotal >= 17 && houseTotal <= 21){
                Card nextCard = deck.drawCard();
                System.out.println("House draws the " + nextCard.declareCard());
                houseTotal += nextCard.getValue(true);
            } else {
                System.out.println("Invalid option, try again");
            }

        }

        System.out.println("Game Results!");
        if (houseTotal > 21){
            System.out.println("The House busted! \t The Player wins.");
        } 
        
        if(houseTotal > playerTotal){
            System.out.println("The House wins");
        } if( playerTotal > houseTotal){
            System.out.println("The Player wins");
        } if(playerTotal == houseTotal){
            System.out.println("There's a tie");
        }
            

        scnr.close();
    }
    }

        
}