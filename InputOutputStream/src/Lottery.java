import java.util.Random;
import java.io.FileWriter;

public class Lottery
{
	public static void main (String [] args) throws Exception
	{
		int row = 5;
		int col = 5;

		FileWriter out = new FileWriter ("Lottery.csv");

		for (int i = 0; i < row; ++ i)
		{
			for (int j = 0; j < col; ++ j)
			{
				int number = new Random ().nextInt (10) + 1;
				out.write (number + (j != 9 ? "," : ""));
			}
			out.write ("\n");
		}

		out.close ();
	}
}