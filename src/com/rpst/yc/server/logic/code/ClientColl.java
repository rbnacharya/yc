package com.rpst.yc.server.logic.code;

import java.util.Dictionary;
import java.util.Enumeration;
import com.rpst.yc.commons.def.RClient;
import com.rpst.yc.commons.dt.def.IClientColl;
import java.util.Hashtable;

public class ClientColl {
	private static int totalConnected;
	private static int totalAvailable;
	private static int cl_ids;
	private static ClientColl cc;
	Dictionary<Integer, IClientColl> clients;
	private ClientColl() {
		clients=new Hashtable<Integer,IClientColl>();		
		totalConnected=0;
		totalAvailable=0;
		cl_ids=0;
		
	}
	public static ClientColl getInstance(){
		if(cc==null){
			cc=new ClientColl();
		}
		return cc;
	}
	public static int getTotalClient() {
		return totalConnected;
	}
	public static int getGetNOOFFreeClients() {
		return totalAvailable;
	}
	public boolean addClient(RClient client){
		IClientColl ic=new IClientColl();
		ic.setClient(client);
		cl_ids++;
		ic.setID(cl_ids);
		ic.setAvailable(true);
		clients.put(new Integer(cl_ids), ic);
		totalAvailable++;
		totalConnected++;
		return true;
	}
	public boolean removeClient(RClient cl){
		return this.remClient(this.getKeyFromClient(cl));
	}
	public boolean remClient(int id){
		clients.remove(new Integer(id));
		return true;
	}
	public RClient getFreeClient(){
		int fkk=this.getFreeClientKey();
		if(fkk!=-1){
			return this.getClientFromKey(fkk);
		}
		return null;
	}
	public int getFreeClientKey(){
		int a=-1;
		Enumeration<Integer> enumKey = clients.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    IClientColl val = clients.get(key);
		    if(val.isAvailable()){
		    	a=key;
		    }
		}
		return a;
	}
	public boolean haveFreeClient(){
		if(this.getFreeClientKey()>0){
			return true;
		}
		return false;
	}
	public RClient getClientFromKey(int key){
		IClientColl val=clients.get(new Integer(key));
		return val.getClient();
	}
	public int getKeyFromClient(RClient cl){
		Enumeration<Integer> enumKey = clients.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    IClientColl val = clients.get(key);
		    if(val.getClient().equals(cl)){
		    	return key;
		    }
		}
		return -1;
	}
	public boolean consumereleaseClient(RClient cl,boolean release){
		Integer key=this.getKeyFromClient(cl);
		if(key!=-1){
			IClientColl val=clients.get(key);
			val.setAvailable(release);
			totalAvailable--;
		}
		return false;
	}
	public boolean releaseClient(RClient cl){
		return this.consumereleaseClient(cl, true);
	}
	public boolean consumeClient(RClient cl){
		return this.consumereleaseClient(cl, false);
	}
}
