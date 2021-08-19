//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;
import java.util.Scanner;

public class LineTotaller
{
   private String line;

	public LineTotaller()
	{
		setLine("");
	}

	public LineTotaller(String s)
	{		
      setLine(s);
	}

	public void setLine(String s)
	{
      line = s;
	}

	public int getSum()
	{
		int total = 0;

      Scanner chopper = new Scanner(line);
      
      while (chopper.hasNextInt())
      {
         total += chopper.nextInt();
      }

      
		return total;
	}

	public String getLine()
	{
		return line;
	}

	public String toString()
	{
		return getLine() + "\n" + "sum = " + getSum() + "\n";
	}
}