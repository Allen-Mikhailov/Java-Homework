//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;

public class TriangleOne
{
   private int size;
   private String letter;

	public TriangleOne()
	{
      setTriangle("", 0);

	}

	public TriangleOne( String let, int sz)
	{
      setTriangle(let, sz);
	}

	public void setTriangle(String let, int sz)
	{
      letter = let;
      size = sz;
	}

	public String getLetter()
	{
		return letter;
	}

	public String toString()
	{
		String output="";
      for (int i = 1; i <= size; i++)
      {
         for (int j = 1; j <= i; j++)
         {
            output = output + letter;
         }
         output += "\n";
      }









		return output+"\n";
	}
}