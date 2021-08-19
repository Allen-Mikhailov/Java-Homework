//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;

public class DigitAdderRunner
{
	public static void main( String args[] )
	{
      System.out.println("Allen Mikhailov 7th");
   
		DigitAdder.print(234);
      DigitAdder.print(10000);
      DigitAdder.print(111);
      DigitAdder.print(9005);
      DigitAdder.print(84645);
      DigitAdder.print(8547);
      DigitAdder.print(123456789);
      
      int x = 3;
      	int y = 5;
      	int z = 9;
      	while (z > x + y)
      	{
         		x = y + z;
         		y = x + z;
         		z = x - y;
      	}
      	System.out.println("x = " + x);
      	System.out.println("y = " + y);
      	System.out.println("z = " + z);






	}
}