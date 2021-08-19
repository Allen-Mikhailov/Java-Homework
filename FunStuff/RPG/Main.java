import static java.lang.System.*;
import java.util.*;

public class Main
{
   public static Vector2 BoardSize = new Vector2(21, 5); 
   public static void main(String args[])
   {
      //Entity Dictionary
      HashMap<String, Entity> Entities = new HashMap<String, Entity>();
      
      //AI Types
      AI AIContainer = new AI();
      
   
      //Input Setup
      Scanner Scan = new Scanner(System.in);
      
      //Create Player Object
      Vector2 StartPos = new Vector2(10, 2);
      Entities.put("Player", new Entity("Player", StartPos, "X", ""));
      
      //Test AI
      Entities.put("Test", new Entity("Test", new Vector2(0, 0), "Y", "Basic"));
      
      //MoveCount
      int MoveCount = 0;
      
      
      //Game Loop
      while (true) {
         //LoadBoard
         Board GameBoard = new Board(BoardSize.X, BoardSize.Y, 1);
         for (String i : Entities.keySet())
         {
            Entity newEntity = Entities.get(i);
            Vector2 newEntityPos = newEntity.Position;
            GameBoard.Board[newEntityPos.X][newEntityPos.Y] = newEntity.Tile;
         }
         GameBoard.printBoard();
         
         //Move
         String raw = Scan.nextLine();
         String input = raw.toLowerCase();
         int XChange = 0;
         int YChange = 0;
         if (input.startsWith("w")) {
            YChange = -1;
         } else if (input.startsWith("s")) {
            YChange = 1;
         } else if (input.startsWith("d")) {
            XChange = 1;
         } else if (input.startsWith("a")) {
            XChange = -1;
         }
      
      
         Entity Player = Entities.get("Player");
         Vector2 oldPosition = Player.Position;
         
         //Out of Bounds check
         int newX = oldPosition.X+XChange;
         if (newX > BoardSize.X-1){newX = 0;}
         if (newX < 0){newX = BoardSize.X-1;}
         
         int newY = oldPosition.Y+YChange;
         if (newY > BoardSize.Y-1){newY = 0;}
         if (newY < 0){newY = BoardSize.Y-1;}
         
         Vector2 newPosition = new Vector2(newX, newY);
         Player.Position = newPosition;
         
         //EnemyAI
         for (String i : Entities.keySet())
         {
            Entity Mob = Entities.get(i);
            if (Mob.AI == "Basic") 
            {
               AI.Basic(Mob, Player, MoveCount);
            }
         }
         MoveCount++;
      }
   }
}