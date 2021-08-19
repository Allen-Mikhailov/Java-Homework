import java.awt.Graphics; 
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Canvas;
import java.util.Scanner;

class Player
{
   
   public static void Draw(Graphics window, int x, int y)
   {
      window.setColor(Color.GRAY);
      
      window.fillRect(x,y,24,24);
      window.fillRect(x-24,y+24,72,72);
      
      window.fillRect(x-16,y+96,24,40);
      window.fillRect(x+16,y+96,24,40);
      
      window.fillRect(x+16,y+96,24,40);
      window.fillRect(x+16,y+96,24,40);
      
      window.fillRect(x-72,y+32,48,24);
      window.fillRect(x+48,y+32,48,24);
      
      window.fillRect(x-72,y+56,24,24);
      window.fillRect(x+72,y+56,24,24);
      
      
   }
}