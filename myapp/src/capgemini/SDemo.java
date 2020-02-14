package capgemini;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class SDemo {

	public static void main(String[] args) {

		/*
		 * String s1 = "hello";
		 * 
		 * 
		 * String s2 = new String("hello");
		 * 
		 * String s3 = "HELLO";
		 * 
		 * System.out.println(s1.equals(s3));
		 * 
		 * System.out.println(s1 == s3);
		 * 
		 * 
		 * System.out.println(s1.equals(s3));
		 * 
		 * 
		 * 
		 * 
		 * System.out.println(s1.length());
		 * 
		 * System.out.println(s1.indexOf('v'));
		 * 
		 * 
		 * System.out.println(s1.toUpperCase());
		 * 
		 * 
		 * 
		 * System.out.println(s1.equalsIgnoreCase(s3));
		 * 
		 * s1 = s1.concat(s3);
		 * 
		 * System.out.println(s1);
		 * 
		 * String str = "";
		 * 
		 * System.out.println(str.length());
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * 
		 * StringBuffer sb1 = new StringBuffer("hello");
		 * 
		 * StringBuffer sb2 = new StringBuffer("javeed");
		 * 
		 * String str = sb2.toString();
		 * 
		 * System.out.println(sb1 == sb2);
		 * 
		 * 
		 * System.out.println(sb1.toString());
		 * 
		 * sb1.append(sb2);
		 * 
		 * System.out.println(sb1);
		 * 
		 * 
		 * 
		 */		
		
		
		
		
		String fileName = "input.txt";
		
		try {
			RandomAccessFile  raf = new RandomAccessFile(fileName,"r");
			
			 raf.writeChars("This is BVRIT college");
			
			 raf.close();
			
		} catch (FileNotFoundException e) {
						e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
