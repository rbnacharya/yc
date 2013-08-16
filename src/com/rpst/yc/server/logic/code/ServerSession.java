package com.rpst.yc.server.logic.code;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import com.rpst.yc.client.logic.code.Client;
import com.rpst.yc.commons.def.RClient;
import com.rpst.yc.commons.dt.code.User;

public class ServerSession{
	RClient clientt;
	User userr;
	Date startDate;
	Date endDate;
	int costParam;
	UUID session_id;
	int uPC;
	public User getUser() {
		return userr;
	}
	public RClient getClientt() {
		return clientt;
	}
	public UUID getSession_id() {
		return session_id;
	}
	public void setSession_id(UUID session_id) {
		this.session_id = session_id;
	}
	public boolean terminate;
	public ServerSession(Client cli,User ur) {
		this.clientt=cli;
		this.userr=ur;
		this.terminate=false;
	}
	public void start(){
		startDate=new Date();
	}
	public void stop(){
		endDate=new Date();
		this.calculate();
	}
	private void calculate(){
		Calendar c=Calendar.getInstance();
		c.setTime(new Date(startDate.getTime()-endDate.getTime()));
		this.uPC=c.get(Calendar.MINUTE);
	}
	public int getUPC() {
		return uPC;
	}
	public void setUPC(int uPC) {
		this.uPC = uPC;
	}
	public void setCostParam(int costParam) {
		this.costParam = costParam;
	}
}
