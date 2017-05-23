package net.java.sip.communicator.impl.protocol.sip;

import java.util.*;
import org.jitsi.util.*;
import java.io.*;

public class DNSServerLookup {
	
    Logger logger = Logger.getLogger(DNSServerLookup.class);

    public String nsLookUp() {
	try {
	    Process p, proc;
	    BufferedReader reader;

	    p = Runtime.getRuntime().exec("nslookup -type=any _sip._udp.ims.comcast.net");
	    reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

	    int count = 0;
	    List<String> servers = new ArrayList<String>();
	    String line = "";
	    while ((line = reader.readLine()) != null) {
	        if (line.contains("svr hostname") || line.contains("service =")) {
		    servers.add(count++, line.substring(line.trim().lastIndexOf(" ") + 1));
		}
	    }
	    reader.close();
	    p.waitFor();

	    proc = Runtime.getRuntime().exec("nslookup " + servers.get(0).trim());
	    reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

	    String ip = "";
	    String output = "";
	    while ((output = reader.readLine()) != null) {
	        if (output.contains("Address:")) {
		    ip = output.substring(output.trim().lastIndexOf(" ") + 1);
		}
	    }
	    reader.close();
	    proc.waitFor();
            
	    return ip.trim();
	} catch (IOException e) {
	    e.printStackTrace();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
        return null;
    }
}

