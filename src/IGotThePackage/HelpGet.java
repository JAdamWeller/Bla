package IGotThePackage;
public class HelpGet implements Command{
	String theString;
	public HelpGet() {
		theString = "easter egg";
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("usage: httpc get [-v] [-h key:value] URL");
		System.out.println();
		System.out.println("Get executes a HTTP GET request for a given URL.");
		System.out.println();
		System.out.println("\t" + "-v \tPrints the detail of the response such as protocol, status,\n" + 
				"and headers.");
		
		System.out.println("\t" + "-h key:value \tAssociates headers to HTTP Request with the format\n" + 
				"'key:value'.");
	}

}
