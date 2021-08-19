//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleTwoRunner
{
   public static void main( String args[] )
   {
      System.out.println("Allen Mikhailov 7th");
   
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();

				//instantiate a TriangleTwo object
      TriangleTwo tw = new TriangleTwo( value, big );
         	//call the toString method to print the triangle 
			System.out.println( tw );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}