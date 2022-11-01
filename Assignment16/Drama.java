//Drama.java

public class Drama extends Movie
{
    //Default Constructor 
    public Drama(){
        super();
    }
    
    //Conversion Constructor
    public Drama(String newRating, int newID, String newTitle){
        super(newRating, newID, newTitle);
    }
    
    //Copy Conversion
    public Drama(Action other){ 
        super(other.getRating(), other.getID(), other.getTitle());
        
    }
    
    public double calcLateFees(int day){
        return 2 * day;
    }
    
    
}
