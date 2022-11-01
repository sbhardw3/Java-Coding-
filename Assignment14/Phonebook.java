
import java.util.Scanner;
public class Phonebook
{
    public PhoneRecord[] phone;
    public int count = 0;
    
    public Phonebook(int listing){
        phone = new PhoneRecord[listing];
    }
    
    // reading the values from the user
    public void readRecord(){
        Scanner keyb = new Scanner(System.in);
        
        System.out.println("First name: ");
        String firstName = keyb.nextLine();
        
        System.out.println("Last name: ");
        String lastName = keyb.nextLine();
        
        System.out.println("Number: ");
        String number = keyb.nextLine();
        
        //Intialising value for every field in the array
        phone[count] = new PhoneRecord(firstName, lastName, number);
        count++;
        
        
    }
   
    // returning String for a specific a record #i
    public String toString(int i){
        return (phone[i].firstName + " " + phone[i].lastName + " " + phone[i].number);
    }
    
    //Prinitng a specific record
    public void writeRecord(int i){
        System.out.println("Phone record " + i);
        System.out.println(phone[i+1].firstName + " " + phone[i+1].lastName + " " + phone[i+1].number);
    }
    
    // Printing the whole phonebook
    public void writebook(){
        System.out.println("Phone book: ");
        for (int i = 0; i < count; i++)
        System.out.println(phone[i].firstName + " " + phone[i].lastName + " " + phone[i].number);
        
    }
}
