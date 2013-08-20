package com.rpst.yc.server.logic.code;

import java.io.IOException;
import java.net.BindException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.ExportException;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

import com.rpst.yc.commons.code.YCValues;
import com.rpst.yc.commons.def.RServer;

public class ServerInit {
	static Server server;
	String serverIP;
	int port;
	public ServerInit(String sip,int port,Server ser) {
		this.serverIP=sip;
		this.port=port;
		if(ser==null)
			server=new Server();
	}
	
	public static Server getServer() {
		return server;
	}

	public static void setServer(Server server) {
		ServerInit.server = server;
	}

	public String getServerIP() {
		return serverIP;
	}

	public void setServerIP(String serverIP) {
		this.serverIP = serverIP;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void play() throws BindException{
		 // Assign a security manager, in the event that dynamic
	       // classes are loaded
            if(System.getSecurityManager()==null)
                System.setSecurityManager(new SecurityManager());
            	System.setProperty("java.rmi.server.hostname", this.serverIP);

               String rmiserver="rmi://"+this.serverIP+"/";
	       RServer server=new Server();
	       try {
                    RServer stub=(RServer)UnicastRemoteObject.exportObject(server,0);
                    Registry reg=LocateRegistry.createRegistry(this.port);
                    reg.rebind(rmiserver+YCValues.Server_Class, stub);
                    System.out.println("Server Started at Port"+this.port);
 
		}catch(ExportException ex){
			throw new BindException();
		}
	    catch (RemoteException e) {
			e.printStackTrace();
		}

	}
	public void createOrSave(){
		
	}
	public void setLogger() throws IOException{
		Logger logger=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.INFO);
		FileHandler xmlfile=new FileHandler("serverlog.xml");
		XMLFormatter xform=new XMLFormatter();
		xmlfile.setFormatter(xform);
		logger.addHandler(xmlfile);
	}
	
}
