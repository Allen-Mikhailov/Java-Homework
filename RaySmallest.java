//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov
//Date 4/28/2021

public class RaySmallest
{
	public static int go(int[] ray)
	{
      int smallest = ray[0]; 
      for (int i = 1; i < ray.length; i++) //We skip the first one because we set it as the smallest value at the start. Don't takes points off for that plz
      {
         if (ray[i] < smallest)
            smallest = ray[i];
      }
		return smallest;
	}
}