package com.rpst.yc.server.logic.code;

import java.rmi.Naming;
import java.rmi.RMISecurityManager;
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
			
	       RServer server=new Server();
	       try {
			RServer stub=(RServer)UnicastRemoteObject.exportObject(server,0);
		    Registry reg=LocateRegistry.createRegistry(YCValues.RMI_PORT);
		    reg.rebind(YCValues.Server_Class, stub);
		    System.out.println("Server Started at Port"+YCValues.RMI_PORT);
 
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void CreateOrSave(){
		
	}
	public static void main(String[] args) {
		new ServerInit();
	}

}
