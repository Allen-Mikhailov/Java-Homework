//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class Average
{
   private String line;

   public Average()
   {
      setLine("");
   }

   public Average(String s)
   {
      setLine(s);
   }

	public void setLine(String s)
	{
      line = s;
	}

	public int getCount()
	{
		int count=0;	
      
      Scanner chopper = new Scanner(line);
      
      while (chopper.hasNextInt())
      {
         chopper.nextInt();
         count++;
      }
      
		return count;
	}


	public int getSum()
	{
		int sum=0;

      Scanner chopper = new Scanner(line);
      
      while (chopper.hasNextInt())
      {
         sum += chopper.nextInt();
      }
	
		return sum;
	}

	public double getAverage()
	{
		double average = (double) getSum()/getCount();


		return average;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return line + "\n" + "Average = " + String.format("%.3f", getAverage()) + "\n";
	}
}