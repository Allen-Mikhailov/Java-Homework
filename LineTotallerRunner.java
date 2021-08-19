//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotallerRunner
{
   public static void main( String args[] )
   {
      System.out.println("Allen Mikhailov 7th");

      LineTotaller lineTotaller = new LineTotaller();
      Scanner scan = new Scanner(System.in);
      
      lineTotaller.setLine("1 2 3 4 5 6");
      System.out.println(lineTotaller);
      
      lineTotaller.setLine("10 20 30 40 50 60");
      System.out.println(lineTotaller);
      
      lineTotaller.setLine("250 657 2154 345 6796");
      System.out.println(lineTotaller);
      
      lineTotaller.setLine("0");
      System.out.println(lineTotaller);
      
      lineTotaller.setLine("-99 45 -98 92 87");
      System.out.println(lineTotaller);
	}
}