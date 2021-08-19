//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov 7th

import static java.lang.System.*;

public class MultTableRunner
{
	public static void main ( String[] args )
	{
      System.out.println("Allen Mikhailov 7th\n");
      
      String s = "aazz";
for (int i = s.length()-1; i > -1; i--)
System.out.print(s.charAt(i));
   
		MultTable multTable = new MultTable();
      
      multTable.setTable(5, 5);
      multTable.printTable();
      
      multTable.setTable(3, 7);
      multTable.printTable();
      
      multTable.setTable(1, 6);
      multTable.printTable();
      
      multTable.setTable(9, 9);
      multTable.printTable();
      
      multTable.setTable(7, 8);
      multTable.printTable();
		
	}
}