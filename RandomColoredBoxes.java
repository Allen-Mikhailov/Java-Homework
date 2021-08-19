//© A+ Computer Science  -  www.apluscompsci.com
//Name Allen Mikhailov
//Date 4/8/2021
//Class pre AP computer sci 7th
//Lab  Random Colors

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.JPanel;

public class RandomColoredBoxes extends JPanel
{
   private Timer timer;
   private final static int SLEEP = 110;
   
   private static int SquareSize = 10;
   private static int SquareBuffer = 10;
   private static int SpaceBuffer = SquareSize + 1;
	
   public RandomColoredBoxes()
   {		
      setBackground(Color.BLACK);
      setVisible(true);
   
      ActionListener paintCaller = 
         new ActionListener(){
            public void actionPerformed(ActionEvent event)
            {
               repaint();  
            }
         };
      timer = new Timer(SLEEP, paintCaller);
      timer.start();
   }	

   public void paintComponent( Graphics window )
   {
      super.paintComponent(window);
   	
      window.setColor(Color.RED);
      window.setFont(new Font("TAHOMA",Font.BOLD,12));
      window.drawString("Graphics Lab Lab11k ", 20, 40);
      window.drawString("Drawing boxes with nested loops by Allen Mikhailov 7th", 20, 80);
   
      drawBoxes(window);
   }

   public void drawBoxes(Graphics window)
   {
      int XEnd = 800/SquareSize-20; //Its better to save it as a variable than do the calculation every times
      int YEnd = 600/SquareSize-20;
      for (int x = SquareBuffer; x < XEnd; x++) 
         for (int y = SquareBuffer; y < YEnd; y++)
         {
            //I could put this is one line but it will look bad
            float r = (float) Math.random();
            float g = (float) Math.random();
            float b = (float) Math.random();
            window.setColor(new Color(r, g, b));
            window.fillRect(SpaceBuffer*x, SpaceBuffer*y,SquareSize,SquareSize);
         }
   }
}