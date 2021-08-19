public class Entity
{  
   public String Name;
   public Vector2 Position;
   public String Tile;
   public String AI = "";
   public Memory EntityMemory = new Memory();
   public Entity(String name, Vector2 pos, String tile, String AIType)
   {
      Name = name;
      Position = pos;
      AI = AIType;
      Tile = tile;
   }
}