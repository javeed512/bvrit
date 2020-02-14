package capgemini;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RAFExample {

	static final String FILEPATH = "myFile.txt";

	public static void main(String[] args) {
		try {
			 System.out.println(new String(readFromFile(FILEPATH, 1, 30)));
			//writeToFile(FILEPATH, "This is BVRIT College at Narsapur", 1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void writeToFile(String filePath, String data, int position) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "rw");
		file.seek(position);
		file.write(data.getBytes());
		System.out.println("data written to the file");
		file.close();
	}

	private static byte[] readFromFile(String filePath, int position, int size) throws IOException {
		RandomAccessFile file = new RandomAccessFile(filePath, "r");
		file.seek(position);
		byte[] bytes = new byte[size];
		file.read(bytes);
		file.close();
		return bytes;
	}

}
