
public class main
{
    public static void main(String[] args){
      
        Phonebook pb = new Phonebook(3);
        pb.readRecord();
        pb.readRecord();
        pb.readRecord();
        pb.writebook();
        System.out.println(); //for space 
        pb.writeRecord(1);
        
        
   }
    
    
    
   
}
