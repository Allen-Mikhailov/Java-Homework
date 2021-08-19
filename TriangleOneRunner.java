//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;
import java.util.Scanner;

public class TriangleOneRunner
{
	public static void main( String args[] )
   {
      

int total = 0;
for(int i = 1; i <= 7; i = i + 2)
   for(int x = 1; x <= i; x = x + 3)
      total = total + x;
System.out.println(total);
   
      System.out.println("Allen Mikhailov 7th");
   
   	Scanner keyboard = new Scanner(System.in);
   	String choice="";
		do{
			out.print("Enter the size of the triangle : ");
			int big = keyboard.nextInt();
			out.print("Enter a letter : ");
			String value = keyboard.next();
         
         TriangleOne test = new TriangleOne(value, big);

				//static methods can be called using the class name
			System.out.println( test );

			System.out.print("Do you want to enter more data? ");
			choice=keyboard.next();
		}while(choice.equals("Y")||choice.equals("y"));
	}
}