
public class Deck{

    public Card drawCard(){

        int value = (int)(Math.random() * 14 )+ 1;
        int num = (int)(Math.random() * 4) + 1;

        String suit = null;

        switch(num){

            case 1:
                 suit = "Spades";
                 break;
            case 2:
                 suit = "Clubs";
                break;
            case 3:
                suit = "Hearts";
                break;
            case 4:
                suit = "Diamonds";
                break;
        }



        return new Card(value, suit);
    }
}