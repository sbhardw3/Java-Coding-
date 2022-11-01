import java.awt.Color;

public class ITSC1212Lab3 {

    /*
    *4) "w" is required because it is a platform
    * in which the turtle can perform some actions
    * 
    *6) Now the size of the world is set, 
    * now the turtle cannot go outside the 
    * parameters (100,100)
    */

    

    public static void main(String[] args){
        World w = new World(500,500);
        Turtle tom = new Turtle(250,250,w);
        /*
        //   Part B

        tom.forward();
        tom.turn(270);
        tom.penUp();

        tom.forward(50);
        tom.turn(180);
        tom.penDown();
        tom.forward();

        //Writing the letter o with all the operations
        tom.penUp();
        tom.turnRight();
        tom.forward(15);
        tom.penDown();
        tom.forward();
        tom.turn(180);
        tom.forward();
        tom.turnRight();
        tom.forward(50);
        tom.turnRight();
        tom.forward();

        //Writing the letter M wiht all the operation

        tom.penUp();
        tom.turnLeft();
        tom.forward(15);
        tom.penDown();
        tom.turnLeft();
        tom.forward();
        tom.turnRight();
        tom.turn(30);
        tom.forward(50);
        tom.turn(300);
        tom.forward(40);
        tom.turn(120);
        tom.forward();

        */

        /*
        //     PART C

        tom.hexagon();

        //set tom's color to black and making another hexagon
        tom.setPenColor(Color.BLACK);
        tom.turn(270);
        tom.hexagon();
        
        //set tom's color to magenta and making another hexagon
        tom.setPenColor(Color.MAGENTA);
        tom.turn(270);
        tom.hexagon();

        //set tom's color to cyan and making another hexagon
        tom.setPenColor(Color.CYAN);
        tom.turn(270);
        tom.hexagon();
        */

        //   PART E

        tom.setPenWidth(10);
        tom.hexagon();

        //set tom's color to black and making another hexagon
        tom.setPenWidth(2);
        tom.setPenColor(Color.BLACK);
        tom.turn(270);
        tom.hexagon(100);
        
        //set tom's color to magenta and making another hexagon
        tom.setPenWidth(10);
        tom.setPenColor(Color.MAGENTA);
        tom.turn(270);
        tom.hexagon();

        //set tom's color to cyan and making another hexagon
        tom.setPenWidth(2);
        tom.setPenColor(Color.CYAN);
        tom.turn(270);
        tom.hexagon(100);

        tom.setPenColor(Color.GREEN);
        tom.turn(270);
        tom.hexagon(100);

        tom.setPenWidth(10);
        tom.setPenColor(Color.BLACK);
        tom.turn(270);
        tom.hexagon();

        tom.setPenWidth(2);
        tom.setPenColor(Color.MAGENTA);
        tom.turn(270);
        tom.hexagon(100);

        tom.setPenWidth(10);
        tom.setPenColor(Color.CYAN);
        tom.turn(270);
        tom.hexagon();




       



        

        
        










        
        

    }


    
}
