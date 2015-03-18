package whilelang;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;

public class MyLoggerTest {
	
	@Test
	public void testLog() {

		MyLogger.delete();

		String m1 = "Heres the first message", m2 = "Heres the second message";
		MyLogger.log(m1);
		assertEquals("First message was not written to file", 1, getLines()
				.size());
		assertEquals("First message was not written to file", m1, getLines()
				.get(0));

		MyLogger.log(m2);
		assertEquals("Second message was not written to file", 2, getLines()
				.size());
		assertEquals("First message was removed from file", m1,
				getLines().get(0));
		assertEquals("Second message was not written to file", m2, getLines()
				.get(1));
	}

	private List<String> getLines() {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(MyLogger.PATH));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		List<String> list = new ArrayList<>();
		while (scanner.hasNextLine()) {
			list.add(scanner.nextLine());
		}
		return list;
	}

}
