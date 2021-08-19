//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
      setTriangle(0, "");
	}

	public TriangleThree( String let, int sz)
	{
      setTriangle(sz, let);
	}

	public void setTriangle(int count, String let)
	{
      size = count;
      letter = let;
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
         for (int j = i; j < size; j++)
            output += " ";
         
         for (int k = size-i; k < size; k++) 
            output += letter;
         
         output += "\n";
      }
      
		return output+"\n";
	}
}