package com.rpst.yc.server.logic.code;

import java.util.UUID;
import com.rpst.yc.commons.def.RClient;
import com.rpst.yc.commons.dt.code.User;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SessionColl {
	HashMap session;
	private static SessionColl inssess;
	private SessionColl() {
		session=new HashMap();
	}
	public static SessionColl getInstance(){
		if(inssess==null){
			inssess=new SessionColl();
		}
		return inssess;
	}
	public UUID createSession(RClient cl,User us){
		this.destroyLastSessionOfClient(cl);
		UUID sid=this.createUUID();
		ServerSession sess=new ServerSession(cl, us);
		sess.setSession_id(sid);
		sess.start();
		return sid;
	}
	
	public boolean startSession(User ur){
                Iterator i=session.entrySet().iterator();
		while(i.hasNext()) {
                    Map.Entry me=(Map.Entry)i.next();
		    ServerSession val = (ServerSession)me.getValue();
		    if(val.getUser().equals(ur)){
		    	val.start();return true;
		    }
		}
		return false;
	}
	public RClient getClientFUser(User ur){
                Iterator i=session.entrySet().iterator();
		while(i.hasNext()) {
                    Map.Entry me=(Map.Entry)i.next();
		    ServerSession val = (ServerSession)me.getValue();
		    if(val.getUser().equals(ur)){
		    	return val.getClientt();
		    }
		}
		return null;
	}
	
	public boolean stopSession(User ur){
		Iterator i=session.entrySet().iterator();
		while(i.hasNext()) {
                    Map.Entry me=(Map.Entry)i.next();
		    ServerSession val = (ServerSession)me.getValue();
		    if(val.getUser().equals(ur)){
		    	val.stop();return true;
		    }
		}
		return false;
	}
	public RClient getClientFromUUID(UUID sid){
		Iterator i=session.entrySet().iterator();
		while(i.hasNext()) {
                    Map.Entry me=(Map.Entry)i.next();
		    ServerSession val = (ServerSession)me.getValue();
		    if(val.getSession_id().equals(sid)){
		    	return val.getClientt();
		    }
		}
		return null;
	}
	public int getCostPerSession(UUID sid){
		Iterator i=session.entrySet().iterator();
		while(i.hasNext()) {
                    Map.Entry me=(Map.Entry)i.next();
		    ServerSession val = (ServerSession)me.getValue();
		    if(val.getSession_id().equals(sid)){
		    	return val.getUPC();
		    }
		}
		return -1;

	}
	public boolean destroySession(UUID sid){
		Iterator i=session.entrySet().iterator();
		while(i.hasNext()) {
                    Map.Entry me=(Map.Entry)i.next();
		    int key = (Integer)me.getKey();
		    ServerSession val = (ServerSession)me.getValue();
		    if(val.getSession_id().equals(sid)){
		    	session.remove(key);
		    	return true;
		    }
		}
		return false;
	}
	public boolean destroyLastSessionOfClient(RClient cl){
		int keys=this.getKeyByClient(cl);
		if(keys!=-1){
			session.remove(keys);
		}
		return true;
	}
	private int getKeyByClient(RClient cl){
		Iterator i=session.entrySet().iterator();
		while(i.hasNext()) {
                    Map.Entry me=(Map.Entry)i.next();
		    ServerSession val = (ServerSession)me.getValue();
		    int key = (Integer)me.getKey();
		    if(val.getClientt().equals(cl)){
		    	return key;
		    }
		}
		return -1;
	}
	private boolean checkUniqueUUID(UUID uni){
		Iterator i=session.entrySet().iterator();
		while(i.hasNext()) {
                    Map.Entry me=(Map.Entry)i.next();
		    ServerSession val = (ServerSession)me.getValue();
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
