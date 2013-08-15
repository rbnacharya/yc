package com.rpst.yc.commons.def;

import java.awt.Image;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;

public interface RClient extends Remote{
	public void new_session(UUID id) throws RemoteException;
	public void exit_session() throws RemoteException;
	public void send_message(String msg,int uid) throws RemoteException;
	public Image get_snapshot() throws RemoteException;
}
