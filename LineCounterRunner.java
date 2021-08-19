//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import java.util.Scanner;
import static java.lang.System.*;  

public class LineCounterRunner
{
   public static void main( String args[] )
   {	
      System.out.println("Allen Mikhailov 7th");

      LineCounter Counter = new LineCounter();
      Scanner scan = new Scanner(System.in);
      
      Counter.setLine("9 10 5 20 1 2 3");
      System.out.println(Counter);
      
      Counter.setLine("11 22 33 44 55 66 77 5 6 7");
      System.out.println(Counter);
      
      Counter.setLine("48 52 29 100 50 293 4");
      System.out.println(Counter);
      
      Counter.setLine("0");
      System.out.println(Counter);
      
      Counter.setLine("100 90 95 98 100 97");
      System.out.println(Counter);
	}
}