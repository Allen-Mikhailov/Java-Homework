import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BoardGraphics extends Canvas
{
   public BoardGraphics()
   {
      //BackGround
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint(Graphics window)
   {
      CreateBoard(window); //Draws on specified Window
   }

   public void CreateBoard(Graphics window)
   {
      
      
      //Shapes
      //window.setColor(Color.BLUE);
      //window.drawString("SMILEY FACE LAB by Allen Mikhailov", 35, 35);
      //window.fillOval( 200, 100, 400, 400 );
      
   
   
   }
}