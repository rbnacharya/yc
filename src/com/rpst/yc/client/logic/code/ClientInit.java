package com.rpst.yc.client.logic.code;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import com.rpst.yc.commons.code.YCValues;
import com.rpst.yc.commons.def.RClient;
import com.rpst.yc.commons.def.RServer;

public class ClientInit {
	public ClientInit() {
		 
		  String serverIP=YCValues.ServerIP;
                  String rmiAdd="rmi://"+serverIP+"/";
		  try {
			  Registry reg=LocateRegistry.getRegistry(serverIP,YCValues.RMI_PORT);
			  RServer rser=(RServer) reg.lookup(rmiAdd+YCValues.Server_Class);
			  RClient cl=new Client();
			  rser.addClient(cl);
			  System.out.println("Client Added");
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	      
	}
	public static void main(String[] args) {
		new ClientInit();
	}

}
