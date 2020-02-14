package capgemini;

import java.io.Console;
import java.io.IOException;
import java.io.Reader;

public class ConsoleDemo {

	public static void main(String[] args) {


		
		
		Console con = System.console();
		
		
				System.out.println("Enter name");
	
			char pass[] =	con.readPassword();
		

				String password = new String(pass);
			
				System.out.println(password);
		
		
		
		
		
		
		

	}

}
