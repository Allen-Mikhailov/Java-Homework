public class Cyfer
{
   public static void main ( String[] args )
   {
      String Keys = "07.10.07 07.16.02 08.19.07 08.13.06 08.06.05 07.16.02 08.14.02 08.01.04 08.09.10 07.12.04 08.08.09 08.15.04 07.16.02 07.01.03 07.33.03 08.01.04 07.23.07 07.31.11 07.27.02";
      String B1;
      String B2;

   
      String Cyfer = "";
      int p = 0;
      
      
      int LastIndex = 0;
      while (true)
      {
         //Getting Key
         int SpaceIndex = Keys.indexOf(" ");
         boolean BreakTurn = false;
         
         String newKey;
         System.out.println(SpaceIndex);
         if (SpaceIndex == -1)
         {
            newKey = Keys.substring(LastIndex+1);
            BreakTurn = true;
         } else {
            newKey = Keys.substring(LastIndex+1, SpaceIndex);
         }
         LastIndex = SpaceIndex;
         System.out.println(newKey);
         if (BreakTurn)
            break ;
         Keys = Keys.substring(SpaceIndex+1);
      }
      System.out.println(Cyfer);
   }
}