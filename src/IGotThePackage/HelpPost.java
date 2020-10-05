package IGotThePackage;
public class HelpPost implements Command{
	String theString;
	public HelpPost() {
		theString = "please don't give me a bad grade";
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("usage: httpc post [-v] [-h key:value] [-d inline-data] [-f file] URL");
		System.out.println();
		System.out.println("Post executes a HTTP POST request for a given URL with inline data or from\n" + 
				"file.");
		System.out.println();
		System.out.println("\t" + "-v \tPrints the detail of the response such as protocol, status,\n" + 
				"and headers.");
		
		System.out.println("\t" + "-h key:value \tAssociates headers to HTTP Request with the format\n" + 
				"'key:value'.");
		System.out.println("\t" + "-d string \tAssociates an inline data to the body HTTP POST request.");
		System.out.println("\t" + "-f file  \tAssociates the content of a file to the body HTTP POST\n" + 
				"request.");
		
		System.out.println();
		System.out.println("Either [-d] or [-f] can be used but not both.");
	}


}
