package com.rpst.yc.commons.def;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.rpst.yc.client.logic.code.Client;

public interface RServer extends Remote{
	public boolean AddClient(RClient cl) throws RemoteException;
	public boolean RemoveClient(Client cl) throws RemoteException;

}
