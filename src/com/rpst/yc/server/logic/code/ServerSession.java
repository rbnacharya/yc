package com.rpst.yc.server.logic.code;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import com.rpst.yc.client.logic.code.Client;
import com.rpst.yc.commons.dt.code.User;
import com.rpst.yc.server.logic.def.IServerSession;

public class ServerSession extends IServerSession{
	Client clientt;
	User userr;
	Date StartDate;
	Date EndDate;
	int CostParam;
	UUID session_id;
	int UPC;
	public User getUser() {
		return userr;
	}
	public Client getClientt() {
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
		StartDate=new Date();
	}
	public void stop(){
		EndDate=new Date();
		this.calculate();
	}
	private void calculate(){
		Calendar c=Calendar.getInstance();
		c.setTime(new Date(StartDate.getTime()-EndDate.getTime()));
		this.UPC=c.get(Calendar.MINUTE);
	}
	public int getUPC() {
		return UPC;
	}
	public void setUPC(int uPC) {
		UPC = uPC;
	}
	public void setCostParam(int costParam) {
		CostParam = costParam;
	}
}
