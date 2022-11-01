
/**
 * Shiven Bhardwaj
 */
import java.util.Scanner;

public class kelvinToCelsiusAndFahrenheit
{//Program converts kelvin to celsius and fahrenheit
    public static void main (String[] args) {
        Scanner keyb = new Scanner(System.in);
        //Ask the user to enter the temperature in Kelvin
        System.out.println("Enter temperature in kelvin: ");
        double temperature = keyb.nextDouble();
        // Convert the entered Temperature by the user to Celsius 
        double celsius = temperature - 273.15;
        System.out.println("Temperature in celsius: " + celsius);
        // Converting the celsius in fahrenheit and printing it 
        double fahrenheit = (celsius*9/5) + 32;
        System.out.println("Temperature in fahrenheit: " + fahrenheit);
        // The output:
        //Enter temperature in kelvin: 
        //0
        //Temperature in celsius: -273.15
        //Temperature in fahrenheit: -459.66999999999996
        
        

    }   
}
