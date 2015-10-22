package kp.mmds.importer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Importer {
	public static void importFile(String filename, DataType type) {
		int counter = 0;
		BufferedReader bufferedReader = null;
		try {
			String line;
			bufferedReader = new BufferedReader(new FileReader(filename));
			while ((line = bufferedReader.readLine()) != null) {
				counter++;
				if (counter % 100000 == 0) {
					System.out.println("zaimportowano " + counter + " wierszy");
				}
				type.processLine(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) bufferedReader.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}


}
