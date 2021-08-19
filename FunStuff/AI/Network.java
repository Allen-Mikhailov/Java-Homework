public class Network
{
   public double[][] outputWeights;
   public double[] outputBiases;
   public double[][][] layerWeights;
   public double[][] layerBiases;
   
   public int layerCount = 0;
   public int NodesPerLayer = 0;
   public int OutputNumber = 0;
   public int InputNumber = 0;
   
   public int LifeTime = 0;
   
   private static double Random()
   {
      return (Math.random()*2)-1;
   }
   
   private static double Random(double Weight)
   {
      return ((Math.random()*2)-1)*Weight;
   }
   
   private static double[] AddArrays(double[] Array1, double[] Array2)
   {
      double[] newArray = new double[Array1.length];
      for (int i = 0; i < Array1.length; i++)
      {
         newArray[i] = Array1[i]+Array2[i];
      }
      return newArray;
   }
   
   private static double[] Dot(double[] Array1, double[][] Array2)
   {
      double[] Outputs = new double[Array2.length];
      for (int i = 0; i < Array2.length; i++) 
      {
         double newValue = 0.0;
         for (int v = 0; v < Array1.length; v++) 
         {
            newValue += Array1[v]*Array2[i][v];
         }
         Outputs[i] = newValue;
      }
      return Outputs;
   }
   
   public Network(int inputNumber, int NPL, int Layers, int Outputs)
   {
      NodesPerLayer = NPL;
      layerCount = Layers;
      OutputNumber = Outputs;
      InputNumber = inputNumber;
      layerWeights = new double[Layers][NodesPerLayer][NodesPerLayer];
      layerBiases = new double[Layers][NodesPerLayer];
      outputWeights = new double[Outputs][NodesPerLayer];
      outputBiases = new double[Outputs];
      for (int i = 0; i < inputNumber; i++)
      {
         layerBiases[1][i] = Math.random();
         for (int v = 0; v < NodesPerLayer; v++)
         {
            layerWeights[1][i][v] = Random();
         }
      }
   
      
      for (int i = 1; i < Layers; i++)
      {
         for (int v = 0; v < NodesPerLayer; v++)
         {
            layerBiases[i][v] = Random();
            for (int z = 0; z < NodesPerLayer; z++)
            {
               layerWeights[i][v][z] = Random();
            }
         
         }
      }
      for (int i = 0; i < Outputs; i++)
      {
         outputBiases[i] = Random();
         for (int v = 0; v < NodesPerLayer; v++)
         {
            outputWeights[i][v] = Random();
         }

      }
   }
   
   public Network(Network Parent)
   {
      NodesPerLayer = Parent.NodesPerLayer;
      layerCount = Parent.layerCount;
      OutputNumber = Parent.OutputNumber;
      InputNumber = Parent.InputNumber;
      layerWeights = new double[layerCount][NodesPerLayer][NodesPerLayer];
      layerBiases = new double[layerCount][NodesPerLayer];
      outputWeights = new double[OutputNumber][NodesPerLayer];
      outputBiases = new double[OutputNumber];
      for (int i = 0; i < InputNumber; i++)
      {
         layerBiases[1][i] = Parent.layerBiases[0][i] + Random(.25);;
         for (int v = 0; v < NodesPerLayer; v++)
         {
            layerWeights[1][i][v] = Parent.layerWeights[0][i][v] + Random(.1);
         }
      }
   
      
      for (int i = 1; i < layerCount; i++)
      {
         for (int v = 0; v < NodesPerLayer; v++)
         {
            layerBiases[i][v] = Parent.layerBiases[i][v] + Random(.25);
            for (int z = 0; z < NodesPerLayer; z++)
            {
               layerWeights[i][v][z] = Parent.layerWeights[i][v][z] + Random(.1);
            }
         
         }
      }
      for (int i = 0; i < OutputNumber; i++)
      {
         outputBiases[i] = Parent.outputBiases[i] + Random(.1);
         for (int v = 0; v < NodesPerLayer; v++)
         {
            outputWeights[i][v] = Parent.outputWeights[i][v] + Random(.1);
         }

      }

      //for (int CurrentLayer = 0; CurrentLayer > Parent.layerWeights.length; CurrentLayer++)
      //{
         //for (int CurrentNode = 0; CurrentNode > Parent.layerWeights[CurrentLayer].length; CurrentNode++)
         //{
            //Parent.layerBiases[CurrentLayer][CurrentNode] += Random(.25);
            //for (int CurrentWeight = 0; CurrentWeight > Parent.layerWeights[CurrentLayer][CurrentNode].length; CurrentWeight++)
            //{
               //Parent.layerWeights[CurrentLayer][CurrentNode][CurrentWeight] += Random(.1);
            //}
         //}
      //}
      
   }
   
   public double[] Run(double[] inputs)
   {
      double[] CurrentOutputs = {};
      CurrentOutputs = AddArrays(Dot(inputs, layerWeights[0]), layerBiases[0]);
      for (int i = 1; i < layerCount; i++)
      {
         CurrentOutputs = AddArrays(Dot(CurrentOutputs, layerWeights[i]), layerBiases[i]);
      }
      CurrentOutputs = AddArrays(Dot(CurrentOutputs, outputWeights), outputBiases);
      
      return CurrentOutputs;
   }
}