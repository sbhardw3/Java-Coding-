//main.java

public class main
{
    public static void main(String[] args ){
        Movie x = new Movie("PG-13", 1234, "Titanic");
        
        Action y = new Action("R", 4322, "John Wick");
        
        Comedy z = new Comedy("G", 7263, "Minions");
        
        Drama s = new Drama("R", 3243, "Joker");
        
        System.out.println(x);
        System.out.println("Late fees: $" + x.calcLateFees(4));
        System.out.println(); // Blank space for readability
        
        System.out.println(y);
        System.out.println("Late fees: $" + y.calcLateFees(9));
        System.out.println(); // Blank space for readability
        
        System.out.println(z);
        System.out.println("Late fees: $" + z.calcLateFees(0));
        System.out.println(); // Blank space for readability
        
        System.out.println(s);
        System.out.println("Late fees: $" + s.calcLateFees(1));
        System.out.println(); // Blank space for readabilit
        
        
        
    }
    
}
