package IGotThePackage;
public class Help implements Command {
	String theString;
	public Help() {
		theString = "httpc is a curl-like application but supports HTTP protocol only\n" + "Usage:\n" + "\t" 
				+ "httpc command [arguments]\nThe commands are:\n\\t\" + \"get executes a HTTP GET request "
				+ "and prints the response.\n" + "\t" + "help prints this screen.\n\nUse \\\"httpc help "
						+ "[command]\\\" for more information about a command.";
				
	}
	
	public void execute() {
		System.out.println(theString);




	}
	
}
