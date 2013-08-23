/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.database;

/**
 *
 * @author Pavan Poudel
 */
public class TerminalData {
    String tid;
    String comp_name;
    String profile;
    String ipaddr;
    String username;
    String macaddr;

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMacaddr() {
        return macaddr;
    }

    public void setMacaddr(String macaddr) {
        this.macaddr = macaddr;
    }

    public TerminalData(String tid, String comp_name, String profile, String ipaddr, String username, String macaddr) {
        this.tid = tid;
        this.comp_name = comp_name;
        this.profile = profile;
        this.ipaddr = ipaddr;
        this.username = username;
        this.macaddr = macaddr;
    }

    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
    
    
}
