public class Main
{

   private static void printOutput(double[] output)
   {
      for (int i = 0; i < output.length; i++)
      {
         System.out.println(output[i]);
      }
   }
   
   public static void main(String args[])
   {
      int Layers = 2;
      int Outputs = 1;
      int Generations = 10000;
      double TargetNumber = 1;
      
      //double[] inputs = {1};
      
      Network[] Networks = new Network[2];
   
      Network Parent = new Network(1, 2, Layers, Outputs);
      for (int i = 0; i < Generations; i++)
      {
         double[][] outputs = new double[2][1];
         double[] input = {Math.random()};
         Networks[0] = Parent;
         Parent.LifeTime++;
         Networks[1] = new Network(Parent);
         outputs[0] = Networks[0].Run(input);
         outputs[1] = Networks[1].Run(input);
         if (Math.abs(outputs[0][0]-TargetNumber) <= Math.abs(outputs[1][0]-TargetNumber))
         {
            Parent = Networks[0];
         } 
         else 
         {
            Parent = Networks[1];
         }
      }
      double[] input = {Math.random()};
      double[] output = Parent.Run(input);
      System.out.println(Parent.LifeTime);
      printOutput(output);
   }
   
   
}