//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class AverageRunner
{
   public static void main( String args[] )
   {
      System.out.println("Allen Mikhailov 7th");

      Average average = new Average();
      Scanner scan = new Scanner(System.in);
      
      average.setLine("9 10 5 20");
      System.out.println(average);
      
      average.setLine("11 22 33 44 55 66 77");
      System.out.println(average);
      
      average.setLine("48 52 29 100 50 29");
      System.out.println(average);
      
      average.setLine("0");
      System.out.println(average);
      
      average.setLine("100 90 95 98 100 97");
      System.out.println(average);
	}
}