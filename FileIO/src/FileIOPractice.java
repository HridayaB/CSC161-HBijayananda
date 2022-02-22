import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileOutputStream;

public class FileIOPractice {

	public static void main(String[] args) throws IOException {
		File file = null;
		PrintWriter printWriter = null;
		// try
		// {
		file = new File("newfile.txt");
		if (!file.exists()) {
			if (file.createNewFile()) {
				System.out.println("New file: " + file.getName());
			}
		}
		// }
//		catch ( IOException e )
//		{
//			e.printStackTrace();
//			System.exit(-1);
//		} different way to deal with exception besides throws IOExecption beside main, have to have a catch if you do a try
//		finally 
//		{
//			
//		} executes no matter what but is optional
		// PrintWriter printWriter = new PrintWriter ( file.getName ( ) );
		printWriter = new PrintWriter(new FileOutputStream(file.getName(), true));
		printWriter.println("The moon is not full today. It is not an auspicious day!");
		printWriter.println("I am feeling great today.");
		if (printWriter.checkError()) {
			System.out.println("There were errors during the writing of the file " + file.getName());
		}
		printWriter.close();
	} // end of main

}
