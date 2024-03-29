//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;

public class MultTable
{
	private int number;
	private int stop;

	public MultTable()
	{
		number=stop=0;
	}

	public MultTable(int num, int end)
	{
      number = num;
      stop = end;
	}

	public void setTable(int num, int end)
	{
      number = num;
      stop = end;
	}

	public void printTable( )
	{
      System.out.println("multiplication table for " + number);
      for (int i = 1; i <= stop; i++)
      {
         System.out.println(i + "    " + i * number);
      }
      System.out.println("");
	}
}