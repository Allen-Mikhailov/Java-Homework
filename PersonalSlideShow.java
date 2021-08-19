// GraphicsLab09st.java
// This is the student, starting file for Graphics Lab 08.
// This file is identical to Java1520.java.
// This slide show is about Mr. Leon Schram.
// Each student needs to alter this presentation,
// add pictures, add pages, add graphics and make it about him/herself.


import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

//Name Allen Mikhailov 7th

public class PersonalSlideShow extends JPanel implements MouseListener
{

   private int numClicks;
   private Image picture1, picture2, picture3, picture4, picture5, picture6, picture7;
 

   public PersonalSlideShow()
   {
      numClicks = 0;
      addMouseListener(this);
      try {
         picture1 = ImageIO.read(getClass().getResource("IMG_2032.jpg"));
         picture2 = ImageIO.read(getClass().getResource("IMG_1595.mov"));
         picture3 = ImageIO.read(getClass().getResource("US.jpg"));
         picture4 = ImageIO.read(getClass().getResource("GitHub.png"));
         picture5 = ImageIO.read(getClass().getResource("Elkins.jpeg"));
         picture6 = ImageIO.read(getClass().getResource("IMG_2009.jpg"));
         picture7 = ImageIO.read(getClass().getResource("SHeepSimilation.png"));

      } catch (IOException ex) {
         System.err.println("Could not load image");
      }
   }

   public void paint(Graphics g)
   {
      Expo.setBackground(g, Expo.white);
      switch (numClicks)
      {
         case 0 : page1(g); 
            break;
         case 1 : page2(g); 
            break;
         case 2 : page3(g); 
            break;
         case 3 : page4(g);
            break;
         case 4 : page5(g);
            break;
         case 5 : page6(g);
            break;
         case 6 : page1(g);
            numClicks = 0;
            break;
      }
   }

   public void mouseExited(MouseEvent e){}
   public void mouseEntered(MouseEvent e){}
   public void mouseReleased(MouseEvent e){}
   public void mouseClicked(MouseEvent e)	{}
   
   
   public void mousePressed(MouseEvent e)
   {
      numClicks++;
      repaint();
   }

   public void page1(Graphics g)
   {
      Expo.setFont(g,"Arial",Font.BOLD,100);
      Expo.drawString(g,"TITLE PAGE",218,100);
      Expo.setColor(g,Expo.red);
      Expo.fillStar(g,510,350,175,8);
      Expo.setColor(g,Expo.green);
      Expo.drawThickStar(g,510,350,225,8,25);
      Expo.setColor(g,Expo.blue);
      Expo.drawThickStar(g,510,350,275,8,25);
      g.drawImage(picture1,425,265,this);
      Expo.setFont(g,"Times Roman",Font.PLAIN,20);
      Expo.drawString(g,"My name is Allen Mikhailov.",50,300);
      Expo.drawString(g,"Click once to continue.",750,550);
   }

   public void page2(Graphics g)
   {
      Expo.setFont(g,"Algerian",Font.BOLD,100);
      Expo.drawString(g,"PAGE 2",200,100);
      Expo.setColor(g,Expo.blue);
      Expo.fillRectangle(g,100,250,900,500);
      Expo.setColor(g,Expo.chartreuse);
      g.drawImage(picture3,300,300,this);
      Expo.setColor(g,Expo.blue);
      Expo.setFont(g,"Times Roman",Font.PLAIN,20);
      Expo.drawString(g,"I was born in the United states in 2006",100,200);
      Expo.drawString(g,"Click once to continue.",750,550);
   }

   public void page3(Graphics g)
   {
      Expo.setFont(g,"Impact",Font.BOLD,100);
      Expo.drawString(g,"PAGE 3",200,100);
      Expo.setColor(g,Expo.darkGreen);
      Expo.fillRoundedRectangle(g,150,225,960,515,50);
      g.drawImage(picture5,450,300,this);
      Expo.setFont(g,"Times Roman",Font.PLAIN,20);
      Expo.drawString(g,"I am a student at Elkins high school.",100,150);
      Expo.drawString(g,"Click once to continue.",750,550);
   }
   
   public void page4(Graphics g)
   {
      Expo.setColor(g,Expo.red);
      Expo.setFont(g,"Impact",Font.BOLD,100);
      Expo.drawString(g,"PAGE 4",200,100);
      g.drawImage(picture6,350,350,this);
      Expo.setFont(g,"Times Roman",Font.PLAIN,20);
      Expo.drawString(g,"I Have a cat and his name is tuffy",200,200);
      Expo.drawString(g,"Click once to continue.",750,550);
   }
   
   public void page5(Graphics g)
   {
      Expo.setColor(g,Expo.green);
      Expo.setFont(g,"Impact",Font.BOLD,100);
      Expo.drawString(g,"PAGE 5",200,100);
      Expo.drawThickStar(g,500,450,300,5,40);
      g.drawImage(picture7,250,250,this);
      Expo.setFont(g,"Times Roman",Font.PLAIN,20);
      Expo.drawString(g,"For my GT project this year I created an AI Simulation",50,125);
      Expo.drawString(g,"Where I attempted to train an neural network to survice in an environment",50,150);
      Expo.drawString(g,"Click once to continue.",750,550);
   }
   
   public void page6(Graphics g)
   {
      Expo.setColor(g,Expo.black);
      Expo.setFont(g,"Impact",Font.BOLD,100);
      Expo.drawString(g,"PAGE 6",200,100);
      Expo.setColor(g,Expo.red);
      g.drawImage(picture4,150,150,this);
      Expo.setFont(g,"Times Roman",Font.PLAIN,20);
      Expo.drawString(g,"I also have a github but there is nothing useful there",50,125);
      Expo.drawString(g,"https://github.com/SlinkyShelf",50,150);
      Expo.drawString(g,"Click once to continue.",750,550);
   }
}

