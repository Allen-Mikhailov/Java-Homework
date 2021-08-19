import java.util.Scanner;

public class Main
{
   public static void print(String s) {System.out.println(s);} //I am lazy ok System.out.println is too long to type out
   
   public static void Ask()
   {
      Scanner Input = new Scanner(System.in);
   }

   public static void main(String[] args)
   {
      Scanner Input = new Scanner(System.in);
   
      Settings settings = new Settings();
      
      print("Type Help for a list of commands");
      
      //Inf loop
      boolean Break = false;
      while (true) 
      {
         print(Responses.OnStart);
         String Command = Input.nextLine();
         switch (Command)
         {
            case "Exit":
               print(Responses.OnExit);
               Break = true;
               break;
               
            case "Help":
               print(Responses.Help);
               break;
               
            case "Pytha":
               print("Side A:");
               double a = Input.nextDouble();
               print("Side B:");
               double b = Input.nextDouble();
               print("The Hypotenuse is " + math.Pytha(a, b));
               Input.nextLine();
               break;
            default:
               break;
         }
         
         if (Break) 
            break;
      }
   }
}