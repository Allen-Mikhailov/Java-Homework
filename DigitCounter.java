//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;

public class DigitCounter
{
   public static int countDigits( int number )
	{
      int count = 0;
		int sum = number;
      while (sum > 0)
      {
         sum /= 10;
         count++;
      }
		return count; 
	}
   
   public static void print(int number)
   {
      //I am lazy so I just call this function in the runner
      //It makes my code cleaner
      
      System.out.println(number + " contains " + countDigits(number) + " digits");
   }
}