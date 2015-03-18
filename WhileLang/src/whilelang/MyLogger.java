package whilelang;

import static org.junit.Assert.fail;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MyLogger {
	public static String PATH = "C:\\Users\\Benjamin Riddell\\Desktop\\log.txt";

	public static void log(String message) {
		try {
			PrintWriter out = new PrintWriter(new BufferedWriter(
					new FileWriter(PATH, true)));
			out.println(message);
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
			// exception handling left as an exercise for the reader
		}
	}

	public static void delete() {
		try {
			File f = new File(PATH);
			f.delete();
		} catch (Exception e) {
			e.printStackTrace();
			fail();
		}
	}

}
