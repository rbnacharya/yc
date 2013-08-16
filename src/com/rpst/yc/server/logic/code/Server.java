package com.rpst.yc.server.logic.code;
import java.awt.Image;
import java.util.UUID;

import com.rpst.yc.client.logic.code.Client;
import com.rpst.yc.commons.code.YCValues;
import com.rpst.yc.commons.def.RClient;
import com.rpst.yc.commons.def.RServer;
import com.rpst.yc.commons.dt.code.Computer;
import com.rpst.yc.commons.dt.code.User;
import java.rmi.RemoteException;

public class Server extends Computer implements RServer {
	protected ClientColl Clients;
	protected SessionColl sessions;
	public Server() {
		super("","");
		Clients=ClientColl.getInstance();
		sessions=SessionColl.getInstance();
	}
	
	//Client Management
	@Override
	public boolean addClient(RClient cl) throws RemoteException{
		System.out.println("NEw Client Loaded");
		return Clients.addClient(cl);
		
	}
	@Override
	public boolean removeClient(RClient cl) throws RemoteException{
		return Clients.removeClient(cl);
	}
	public boolean isClientFree(){
		return Clients.haveFreeClient();
	}
	public ClientColl getClientCollection(){
		return this.Clients;
	}
	// Client Commands
	public Image getSnapshot(Client cl){
		return null;
	}
	public boolean sendMessage(Client cl){
		return true;
	}
	
	//Client commands
	//End Client Management
	
	//Session Management
	public UUID createUserSession(User us){
		if(isClientFree()){
			RClient cl=Clients.getFreeClient();
			return sessions.createSession(cl, us);
		}
		return null;
	}
	public int getUPC(UUID sid){
		return sessions.getCostPerSession(sid);
	}
	public boolean destroySession(UUID sid){
		return sessions.destroySession(sid);
	}
	public RClient getClientFromSID(UUID sid){
		return sessions.getClientFromUUID(sid);
	}
	public SessionColl getSessionCollection(){
		return this.sessions;
	}
	// -end Session Management
	
	// Server instances
	@Override
	public int getType() {
		return YCValues.CT_Server;
	}
	@Override
	public String getSlug() {
		return YCValues.Server_slug;
	}
}
