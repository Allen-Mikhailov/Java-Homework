//(c) A+ Computer Science
//www.apluscompsci.com
//Name Allen Mikhailov

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import static java.lang.System.*;

public class OddOrEvenRunner
{
	public static void main( String args[] ) throws IOException
	{
   
   
      System.out.println("Allen Mikhailov 7th\n");
      
		Scanner file = new Scanner(new File("oddoreven.dat"));
		int size = file.nextInt();
		file.nextLine();
      
     OddOrEven Checker = new OddOrEven();
      
		for (int i = 0; i < size; i++)
		{
		   num = file.nextInt();
         Checker.setNum(num);
			System.out.println(Checker);
		}
	}
}