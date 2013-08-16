package com.rpst.yc.commons.dt.def;

import com.rpst.yc.client.logic.code.Client;
import com.rpst.yc.commons.def.RClient;

public class IClientColl {
	protected int ID;
	protected boolean	Available;
	protected RClient Client;
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
	public RClient getClient() {
		return Client;
	}
	public void setClient(RClient client) {
		Client = client;
	}
}
