//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Allen Mikhailov

import java.util.Scanner;
import static java.lang.System.*;

public class LineCounter
{
   private String line;

   public LineCounter()
   {
		setLine("");
   }

   public LineCounter(String s)
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

	public String getLine()
	{
		return line + "\n" + "count = "+getCount() + "\n";
	}

	public String toString()
	{
		return getLine();
	}
}