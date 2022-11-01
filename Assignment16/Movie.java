//Movie.java

public class Movie
{
    private String rating;
    private int ID;
    private String title;
    
    //Default Constructor
    public Movie(){
        rating = null;
        ID = 0;
        title = null;
    }
    
    //Conversion constructor
    public Movie(String newRating, int newID, String newTitle){
        rating = newRating;
        ID = newID;
        title = newTitle;
    }
    
    //Copy constructor
    public Movie(Movie other){
        rating = other.rating;
        ID = other.ID;
        title = other.title;
    }
    
    //Accessors
    public String getRating(){
        return rating;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getTitle(){
        return title;
    }
    
    //Mutators
    public void setRating(String newRating){
        rating = newRating;
    }
    
    public void setID(int newID){
        ID = newID;
    }
    
    public void setTitle(String newTitle){
        title = newTitle;
    }
    
    //this method calculates the late fees of the given movie
    public double calcLateFees(int day){
        return 2*day;
    }
    
    public boolean equals(Movie other){
        if (other == null)
        return false;
        
        else{
            return rating.equals(other.rating) && ID == other.ID
                                     && title.equals(other.title);
        }
    }
    
    public String toString(){
        return ("Rating(G, PG, PG-13, R): " + rating + "\nID: " + ID + 
                            "\nTitle: " + title);
    }
    
    
        
        
}


