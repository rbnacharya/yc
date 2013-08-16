package com.rpst.yc.commons.dt.def;

import com.rpst.yc.client.logic.code.Client;

public class IClientColl {
	protected int ID;
	protected boolean	Available;
	protected Client Client;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public boolean isAvailable() {
		return Available;
	}
	public void setAvailable(boolean available) {
		Available = available;
	}
	public Client getClient() {
		return Client;
	}
	public void setClient(Client client) {
		Client = client;
	}
}
