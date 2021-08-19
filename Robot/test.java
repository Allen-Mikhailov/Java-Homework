public class test
{
   public static void test1()
   {
      test2();
   }

   public static void test2()
   {
      System.out.println("Test");
   }

   public static void main( String args[] )
   {
      test1();
   }

}