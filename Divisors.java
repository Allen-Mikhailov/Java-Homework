//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;

public class Divisors
{
	public static String getDivisors( int number )
	{
		String divisors= "";
      
      for (int i = 1; i < number; i++)
      {
         if (number%i == 0)
         {
            divisors += i + " ";
         }
      }
      
		return divisors; 
	}
   
   public static void print(int number)
   {
      System.out.println(number + " has divisors " + getDivisors(number));
   }
}