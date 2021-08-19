//(c) A+ Computer Science
//www.apluscompsci.com
//Name Name Allen Mikhailov 7th

import static java.lang.System.*;

public class ReverseNumber
{
	int number;
   
   public ReverseNumber()
   {
      number = 0;
   }
   
   public ReverseNumber(int num)
   {
      number = num;
   }
   
   public void SetNumber(int num)
   {
      number = num;
   }
	
	private static int GetDigits(int n)
   {
      int Digits = 0;
      while (n > 0)
      {
         Digits++;
         n /= 10;
      }
      return Digits;
   }

	public int getReverse()
	{
		int rev=0;
      int num = number;
      int Digits = GetDigits(num) - 1;
      while (num > 0)
      {
         rev += num%10 * Math.pow(10, Digits);
         num /= 10;
         Digits--;
      }
		return rev;
	}

   public String toString()
   {
      return number + " reversed is " + getReverse();
   }
	
}