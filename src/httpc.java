import java.net.*;

import IGotThePackage.Get;
import IGotThePackage.GetCommand;
import IGotThePackage.Help;
import IGotThePackage.HelpGet;
import IGotThePackage.HelpPost;

import java.io.*;
import IGotThePackage.Command;
import IGotThePackage.Help;
import IGotThePackage.HelpGet;
import IGotThePackage.HelpPost;
import IGotThePackage.Get;
import IGotThePackage.GetCommand;

public class httpc {


	public static void main(String[] args) {
		
		if (args != null && args[0].toLowerCase().equals("help")){
			if (args.length == 1) {
				Help help = new Help();
				help.execute();
			}
			else if (args.length==2) {
				if (args[1].toLowerCase().equals("get")) {
					HelpGet help = new HelpGet();
					help.execute();
				}
				else if (args[1].toLowerCase().equals("post")) {
					HelpPost help = new HelpPost();
					help.execute();
				}
				else {
					Help help = new Help();
					help.execute();
				}
			}
			else {
				Help help = new Help();
				help.execute();
			}
		}
		
		
		else if (args !=null && args[0].toLowerCase().equals("get")) {
			Get get = new Get();
			
			if(args[1].equalsIgnoreCase("-v")) {
				get.setVerbose(true);
			}
			String[] headCount = new String[10];
			int count = 0;
			for(int i = 1; i<args.length-1; i++) {
				if (args[i].equalsIgnoreCase("-h")){
					headCount[count] = args[i+1];
					count++;
				}
			}
			
			if(count!=0) {
				String[] headers = new String[count];
				for(int i = 1; i<count; i++) {
					headers[i] = headCount[i];
				}
				get.setHeaders(headers);
			}
			
				GetCommand gc = new GetCommand(get);
				gc.execute();
			
			
		}
		
		
		
		
	}

}

