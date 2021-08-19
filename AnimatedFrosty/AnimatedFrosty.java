//© A+ Computer Science  -  www.apluscompsci.com
//Name Allen Mikhailov 7th
//Date 5/13/2021
//Lab  AnimatedFrosty

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import javax.swing.JFrame;
import java.awt.Canvas;
import java.util.Scanner;

class AnimatedFrosty extends Canvas
{
   private int Direction = 1;
	private int x;
	private int y;
	private Timer timer;
	private final static int SLEEP = 80;  //bigger # = slower animation	
	private Scanner Input;
   
	public AnimatedFrosty(int width, int heigth)
	{
      Input = new Scanner(System.in);
		setSize(width, heigth);
		setVisible(true);
		setBackground(Color.BLACK);

		x = 0;
		y = 100;
      
      //I dont understand how this works so I am just not going to use it
		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
            
				repaint();  //each time timer fires it will call paint
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}	
	
	public void update(Graphics window)
	{
	   paint(window);	
	}
   
   private int Speed = 50;
	
	public void paint( Graphics window )
	{
      
      
      
      
		window.setColor(Color.BLACK);
		window.fillRect(0,0,getWidth(),getHeight());
		
		window.setColor(Color.WHITE);
		window.drawString("Animation Lab - Lab05c", 25, 50 );
      window.drawString("W, A, S, D to move in the console", 25, 75 );

		Player.Draw(window, x, y);
// 		window.fillOval(x,y,20,20);
// 		window.fillOval(x-6,y+18,32,32);
// 		window.fillOval(x-15,y+45,50,50);
      
      String i = Input.nextLine();
      
      if (i.length() == 0)
         return;
      
		char inputString = i.toUpperCase().charAt(0);
      
      //You can guess what I am going to do right
      
      switch(inputString)
      {
         case 'W':
            y -= Speed;
            break;
         case 'S':
            y += Speed;
            break;
         case 'D':
            x += Speed;
            break;
         case 'A':
            x -= Speed;
            break;
      }
	}	
}