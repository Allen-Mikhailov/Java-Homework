//© A+ Computer Science  -  www.apluscompsci.com
//Name Allen Mikhailov 7th
//Date 5/13/2021
//Lab  AnimatedFrosty

import javax.swing.JFrame;  

public class GraphicsRunner extends JFrame
{
   private static final int WIDTH = 800;
   private static final int HEIGHT = 600;

   public GraphicsRunner()
   {
      super("Graphics Runner");
      setSize(WIDTH,HEIGHT);
   					
      getContentPane().add(new AnimatedFrosty(WIDTH, HEIGHT));
   			
      setVisible(true);
   }
   
   public static void main( String args[] )
   {
      System.out.println("Allen Mikhailov 7th");
      GraphicsRunner run = new GraphicsRunner();
   }
}