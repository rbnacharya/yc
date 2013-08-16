package com.rpst.yc.server.logic.code;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import com.rpst.yc.commons.code.YCValues;
import com.rpst.yc.commons.def.RServer;

public class ServerInit {
	public ServerInit() {
		// TODO Auto-generated constructor stub
		this.play();
	}
	public void play(){
		 // Assign a security manager, in the event that dynamic
	       // classes are loaded
            String ipadd=YCValues.ServerIP;
                System.setProperty("java.rmi.server.hostname", ipadd);

               String rmiserver="rmi://"+ipadd+"/";
	       RServer server=new Server();
	       try {
                    RServer stub=(RServer)UnicastRemoteObject.exportObject(server,0);
		    Registry reg=LocateRegistry.createRegistry(YCValues.RMI_PORT);
		    reg.rebind(rmiserver+YCValues.Server_Class, stub);
		    System.out.println("Server Started at Port"+YCValues.RMI_PORT);
 
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void createOrSave(){
		
	}
	public static void main(String[] args) {
		new ServerInit();
	}

}
