import static java.lang.System.*;
import java.util.ArrayList;

public class Board
{  
   public String[][] Board;
   public int SX; //BoardSizeX
   public int SY; //BoardSizeY
   public String BoarderLine = "";
   private String Outline = "0";

   public Board(int SizeX, int SizeY, int Boarder)
   {
      SX = SizeX;
      SY = SizeY;
      Board = new String[SX][SY];
      for (int x = 0; x < SX; x++) 
      {
         for (int y = 0; y < SY; y++) 
         {
            Board[x][y] = " ";
         }
      }
      for (int i = 0; i < SX+2; i++)
      {
         BoarderLine = BoarderLine+Outline;
      }
   }

   public void printBoard()
   {
      String BoardPrint = "";
      BoardPrint = BoardPrint+BoarderLine+"\n";
      for (int y = 0; y < SY; y++) 
      {
         BoardPrint = BoardPrint+Outline;
         for (int x = 0; x < SX; x++) 
         {
            BoardPrint = BoardPrint+Board[x][y];
         }
         BoardPrint = BoardPrint+Outline+"\n";
      }
      BoardPrint = BoardPrint+BoarderLine;
      out.println(BoardPrint);
   }
}