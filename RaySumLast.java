//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th
//Date 4/23/2021

public class RaySumLast
{
   public static int go(int[] ray)
   {
      if (ray.length < 1)
         return -1;
   
      int lastValue = ray[ray.length -1];
      int c = 0;
      int Changed = 0;
      for (int i = 0; i < ray.length -1; i++)
         if (ray[i] > lastValue)
         {
            c += ray[i];
            Changed++;
         }
            
      if (Changed < 1)
         return -1;
            
      return c;
   }
}