import java.io.*;

public class StreamCopier
{
	public static void copy (InputStream in, OutputStream out) throws Exception
	{
		// in to read
		// out to write

		byte bytes [] = new byte [100];
		int bytesRead = 0;

		while ((bytesRead = in.read (bytes)) != -1)
		{
			out.write (bytes, 0, bytesRead);
		}

		in.close ();
		out.close ();
	}
}

class StreamCopyTest
{
	public static void main (String [] args) throws Exception
	{
		//InputStream in = new FileInputStream ("StreamCopier.java");
		OutputStream out = new FileOutputStream ("whatever.txt");
		StreamCopier.copy (System.in, out);
	}
}