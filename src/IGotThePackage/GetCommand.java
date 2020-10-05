package IGotThePackage;
import java.net.*;
import java.io.*;

public class GetCommand implements Command {
	Get get;
	
	public GetCommand(Get get) {
		this.get = get;
	}
	
	public void execute() {
		try {
		get.request();
		}
		catch(UnknownHostException uhe) {
			
		}
		catch(IOException ioe) {
			
		}
		catch(URISyntaxException use) {
			
		}
	}
	
}
