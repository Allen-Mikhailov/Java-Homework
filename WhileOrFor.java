//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class WhileOrFor
{
   public static void main( String args[] )
   {
   String s = "azz";
String ns= "";
for (int d = s.length()-1; d > -1; d--)
System.out.print(s.charAt(d));
      
      String original="I am Sam I am";
      char lookFor = 'a';
   
   	//while loop
      out.println("\n   ***** While Loop String Cleaner **** \n");		
      String cleaned = original;
      out.print(original + " with the letter " + lookFor + " removed by a while loop is ");
      int loc = cleaned.indexOf(lookFor);
      while(loc> -1)
      {
         cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
         loc = cleaned.indexOf(lookFor);
      }
      out.println(cleaned);
      out.println();
      
      //for loop
      out.println("\n   ***** For Loop String Cleaner **** \n");	
      
      cleaned = original;
      out.print(original + " with the letter " + lookFor + " removed by a while loop is ");
      for (loc = cleaned.indexOf(lookFor); loc > -1; loc = cleaned.indexOf(lookFor))
      {
         cleaned = cleaned.substring(0, loc) + cleaned.substring(loc + 1);
      }
      out.println(cleaned);
      out.println();
   
   
   
   
      //for loop
      out.println("\n   ***** For Loop Common Divisor **** \n");		
      int one = 528;
      int two = 60;
      out.println("The for loop determined the common divisors of " + one + " and " + two + " are ");
      for(int i = one; i > 1; i--)
      {
         if(one % i == 0 )
            if (two % i == 0)
               out.print(i + " ");
      }
      out.println();
      out.println();
      
      //while loop
      out.println("\n   ***** While Loop Common Divisor **** \n");
      out.println("The for loop determined the common divisors of " + one + " and " + two + " are ");
      int i = one;
      while (i > 1)
      {
         if(one % i == 0 )
            if (two % i == 0)
               out.print(i + " ");
         i--;
      }
      out.println();
      out.println();
      
      
      
      
      
      out.println("\n   ***** My Total Loop My Way **** \n");	
      // write a loop (for or while, your choice) that totals even numbers from 1 to 1000 and prints only the total
      
      int end = 1000;
      
      out.println("\nWhile Loop");
      //while loop
      i = 1;
      int total = 0;
      while (i <= end)
      {
         if (i % 2 == 0)
            total += i;
         i++;
      }
      out.println();
      out.println(total);
      
      out.println("\nFor Loop");
      //For lopp
      total = 0;
      for (i = 1; i <= end; i++)
      {
         if (i % 2 == 0)
            total += i;
      }
   	
      out.println();
      out.println(total);
      
   }
}