//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;

public class DigitMath
{
   private static int countDigits( int number )
	{
		int sum=0;
      while (number > 0)
      {
         sum++;
         number /= 10;
      }
		return sum;
	}

	private static int sumDigits( int number )
	{
		int sum=0;
      while (number > 0)
      {
         sum += number%10;
         number /= 10;
      }
		return sum;
	}

	public static double averageDigits( int number )
	{
		return sumDigits(number) / (double) countDigits(number); 
	}
   
   public static void print( int number )
   {
      System.out.println(number + " has a digit average of " + averageDigits(number));
   }
}