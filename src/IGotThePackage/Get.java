package IGotThePackage;
import java.net.*;
import java.io.*;


public class Get {
	private boolean verbose;
	private String[] headers;
	private String host;
	
	public Get() {
		verbose = false;
		headers = null;
		host = null;
		}
	
	public Get(boolean verbose, String[] headers, String host) {
		
		this.verbose = verbose;
		this.headers = headers;
		this.host = host;
		}
	//This is what GetCommand executes
	public void request() throws UnknownHostException, IOException, URISyntaxException {
		
		Socket socket = new Socket(host, 80);
		
		PrintWriter output = new PrintWriter(socket.getOutputStream());
		BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		URI uri = null;
		uri = new URI(host);
		String domain = uri.getHost();
		
		String quer = uri.getQuery();
		
		
		if (headers != null) {
		output.print("GET /get?" + quer + " HTTP/1.0\r\n" + "Host: " + host + "\r\n");
		for (int i = 0; i < headers.length; i++) {
			if (headers[i] != null) {
				output.print(headers[i] + "\r\n");
			}
		}
		output.println("\r\n");
		}
		
		if (verbose == true) {
			String line = input.readLine();
			while (line != null) {
				System.out.println(line);
				line = input.readLine();
			}
		} else if (verbose == false) {
			String line = input.readLine();
			while (line != null) {
				if (line.contains("{")|| line.contains("}") || line.contains("\"")) {
					System.out.println(line);
				}
				line = input.readLine();
			}
		}

		// Close our streams
		input.close();
		output.close();

		socket.close();
	
		
		
	}
	
	public boolean isVerbose() {
		return verbose;
	}

	public void setVerbose(boolean verbose) {
		this.verbose = verbose;
	}

	public String[] getHeaders() {
		return headers;
	}

	public void setHeaders(String[] headers) {
		this.headers = headers;
	}


	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	
	
}
