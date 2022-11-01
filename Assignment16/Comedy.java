//Comedy.java

public class Comedy extends Movie
{
    //Default Constructor 
    public Comedy(){
        super();
    }
    
    //Conversion Constructor
    public Comedy(String newRating, int newID, String newTitle){
        super(newRating, newID, newTitle);
    }
    
    //Copy Conversion
    public Comedy(Action other){ 
        super(other.getRating(), other.getID(), other.getTitle());
        
    }
    
    public double calcLateFees(int day){
        return 2.50 * day;
    }
    
    
}
