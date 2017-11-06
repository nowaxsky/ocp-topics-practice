package console;

import java.io.Console;

/**
 * this example need to be used in console(cmd)
 * 
 * command: 
 * > javac ConsoleInput.java
 * 
 * > java -cp D:\Eclipse\Java-SE\tutorials\ocp-topics-practice\ch9-IO\src console.ConsoleInput
 * 
 * @author CPM
 *
 */
public class ConsoleInput {

	public static void main(String[] args) {
		Console cons = System.console();
		boolean userValid = false;
		if(cons != null) {
			String account;
			String password;
			do {
				account = cons.readLine("%s", "Account: ");
				password = new String(cons.readPassword("%s", "Password: "));
				
				if(account.equals("test") && password.equals("qwert1")) {
					System.out.println("Correct! System quits!");
					userValid = true;
				} else {
					System.out.println("Wrong! Try again!\n");
				}
			} while (!userValid);
		}
	}
}
