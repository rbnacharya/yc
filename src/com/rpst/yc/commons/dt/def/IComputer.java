package com.rpst.yc.commons.dt.def;


public abstract class IComputer {
	protected String name;
	protected String slug;
	protected String ip_addr;
	protected String mac_addr;
	protected int type;
	
	public IComputer(String name,String mac_addr) {
		this.name=name;
		this.slug=this.getSlug();
		this.ip_addr=this.getIPAddr();
		this.mac_addr=mac_addr;
		this.type=this.getType();
	}
	public abstract int getType();
	public abstract String getSlug();
	public String getIPAddr(){
		return "";
	}
	public String getMacAddr(String ip){
		return "mac";
	}
}
