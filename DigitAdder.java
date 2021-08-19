//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*; 

public class DigitAdder
{
   public static int sumDigits( int number )
	{
      int count = 0;
      while (number > 0)
      {
         count += number % 10;
         number /= 10;
      }
		return count; 
	}
   
   public static void print(int number)
   {
      //I am lazy so I just call this function in the runner
      //It makes my code cleaner
      
      System.out.println(sumDigits(number) + " is the sum of the digits of " + number);
   }

}