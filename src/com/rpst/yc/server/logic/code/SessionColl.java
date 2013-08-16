package com.rpst.yc.server.logic.code;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
// Singleton class
import java.util.UUID;

import com.rpst.yc.client.logic.code.Client;
import com.rpst.yc.commons.def.RClient;
import com.rpst.yc.commons.dt.code.User;

public class SessionColl {
	Dictionary<Integer, ServerSession> session;
	private static SessionColl inssess;
	private SessionColl() {
		session=new Hashtable<Integer,ServerSession>();
	}
	public static SessionColl getInstance(){
		if(inssess==null){
			inssess=new SessionColl();
		}
		return inssess;
	}
	public UUID createSession(Client cl,User us){
		this.destroyLastSessionOfClient(cl);
		UUID sid=this.createUUID();
		ServerSession sess=new ServerSession(cl, us);
		sess.setSession_id(sid);
		sess.start();
		return sid;
	}
	
	public boolean startSession(User ur){
		Enumeration<Integer> enumKey = session.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    ServerSession val = session.get(key);
		    if(val.getUser().equals(ur)){
		    	val.start();return true;
		    }
		}
		return false;
	}
	public RClient getClientFUser(User ur){
		Enumeration<Integer> enumKey = session.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    ServerSession val = session.get(key);
		    if(val.getUser().equals(ur)){
		    	return val.getClientt();
		    }
		}
		return null;
	}
	
	public boolean stopSession(User ur){
		Enumeration<Integer> enumKey = session.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    ServerSession val = session.get(key);
		    if(val.getUser().equals(ur)){
		    	val.stop();return true;
		    }
		}
		return false;
	}
	public RClient getClientFromUUID(UUID sid){
		Enumeration<Integer> enumKey = session.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    ServerSession val = session.get(key);
		    if(val.getSession_id().equals(sid)){
		    	return val.getClientt();
		    }
		}
		return null;
	}
	public int getCostPerSession(UUID sid){
		Enumeration<Integer> enumKey = session.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    ServerSession val = session.get(key);
		    if(val.getSession_id().equals(sid)){
		    	return val.getUPC();
		    }
		}
		return -1;

	}
	public boolean destroySession(UUID sid){
		Enumeration<Integer> enumKey = session.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    ServerSession val = session.get(key);
		    if(val.getSession_id().equals(sid)){
		    	session.remove(key);
		    	return true;
		    }
		}
		return false;
	}
	public boolean destroyLastSessionOfClient(Client cl){
		int keys=this.getKeyByClient(cl);
		if(keys!=-1){
			session.remove(keys);
		}
		return true;
	}
	private int getKeyByClient(Client cl){
		Enumeration<Integer> enumKey = session.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    ServerSession val = session.get(key);
		    if(val.getClientt().equals(cl)){
		    	return key;
		    }
		}
		return -1;
	}
	private boolean checkUniqueUUID(UUID uni){
		Enumeration<Integer> enumKey = session.keys();
		while(enumKey.hasMoreElements()) {
		    Integer key = enumKey.nextElement();
		    ServerSession val = session.get(key);
		    if(val.getSession_id().equals(uni)){
		    	return false;
		    }
		}
	
		return true;
	}
	private UUID createUUID(){
		UUID a=UUID.randomUUID();
		while(!this.checkUniqueUUID(a)){
			a=UUID.randomUUID();
		}
		return a;
	}
}
