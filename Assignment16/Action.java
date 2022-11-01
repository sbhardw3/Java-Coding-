//Action.java

public class Action extends Movie
{
    //Default Constructor 
    public Action(){
        super();
    }
    
    //Conversion Constructor
    public Action(String newRating, int newID, String newTitle){
        super(newRating, newID, newTitle);
    }
    
    //Copy Conversion
    public Action(Action other){ 
        super(other.getRating(), other.getID(), other.getTitle());
        
    }
    
    public double calcLateFees(int day){
        return 3 * day;
    }
    
    
}
