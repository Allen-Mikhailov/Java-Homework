public class Calculator
{
   public static void main(String[] args)
   {
      
      double Contribution = 4000;
      double Money = 100;
      double IntrestRate = 1.30;
      double YearlyAddon = 50000;
      for (int Year = 0;  Year < 100; Year++)
      {
         Money = (Money) * IntrestRate;
         System.out.println(Money);
      }
   }
}