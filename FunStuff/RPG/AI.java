public class AI
{
   public static AIActions Basic(Entity Mob, Entity Player, int CurrentMove) 
   {
      System.out.println(CurrentMove);
      if (CurrentMove < Mob.EntityMemory.LastMove+2) 
      {
         return AIActions.Idle;
      } 
      
      //Setting up Position Variables
      Vector2 MobPos = Mob.Position;
      Vector2 PlayerPos = Player.Position;
      
      //Change Pos Variables
      int ChangeX = 0;
      int ChangeY =  0;
      
      if (MobPos.X > PlayerPos.X) {ChangeX = -1;}
      if (MobPos.X < PlayerPos.X) {ChangeX = 1;}
      
      if (MobPos.Y > PlayerPos.Y) {ChangeY = -1;}
      if (MobPos.Y < PlayerPos.Y) {ChangeY = 1;}
      
      Mob.EntityMemory.LastMove = CurrentMove;
      
      Mob.Position =  new Vector2(MobPos.X+ChangeX, MobPos.Y+ChangeY);
      
      return AIActions.Move; 
   }
}