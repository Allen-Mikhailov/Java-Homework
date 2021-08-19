//(c) A+ Computer Science
//www.apluscompsci.com

//Allen Mikhailov
//11/12/2020
//7th Period
//Robot

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics g )
   {
      
   // draw maze
      g.setColor(Color.black);
      g.fillRect(0,0,800,600);
      g.setColor(Color.cyan);
      g.fillRect(0,80,800,20);
      g.fillRect(0,500,800,20);
   
   // draw 3 snacks
   
      g.setColor(Color.WHITE);
      g.fillOval(300, 250, 80, 80);
      g.fillOval(460, 250, 80, 80);
      g.fillOval(620, 250, 80, 80);
   
   
   // draw PAC-MAN
      g.setColor(Color.YELLOW);
      g.fillOval(0, 120, 300, 300);
      int[] x = {40, 40};
   
      int[] y = {40, 40};
   
      int[] z = {40, 40};
      g.drawPolygon(x, y, z);
   
   
   
   
   
   }
}

