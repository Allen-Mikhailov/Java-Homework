//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov
//Date 4/23/2021 7th

public class RayTotal
{
	public static int go(int[] ray)
	{
      int c = 0;
      for (int i = 0; i < ray.length; i++)
      {
         c += ray[i];
      }
		return c;
	}
}