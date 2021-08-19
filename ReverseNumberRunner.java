//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;

public class ReverseNumberRunner
{
	public static void main( String args[] )
	{
      System.out.println("Allen Mikhailov 7th");
      
      ReverseNumber reverse = new ReverseNumber();
   
      reverse.SetNumber(234);
      System.out.println(reverse);
      
		reverse.SetNumber(10000);
      System.out.println(reverse);
      
      reverse.SetNumber(111);
      System.out.println(reverse);
      
      reverse.SetNumber(9005);
      System.out.println(reverse);
      
      reverse.SetNumber(84645);
      System.out.println(reverse);
      
      reverse.SetNumber(8547);
      System.out.println(reverse);
      
      reverse.SetNumber(123456789);
      System.out.println(reverse);
	}
}