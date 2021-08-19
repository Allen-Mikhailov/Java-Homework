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

	public int getReverse()
	{
		int rev=0;
      while(number>0)
      {
         rev = rev * 10 + number % 10;
         number = number / 10;
      }
      return rev;
	}

   public String toString()
   {
      return number + " reversed is " + getReverse();
   }
	
}