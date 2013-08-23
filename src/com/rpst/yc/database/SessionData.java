/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.database;

import java.util.Date;

/**
 *
 * @author Pavan Poudel
 */
public class SessionData {
    int SessionId;
    String UUID;
    String User;
    String StartTime;
    String EndTime;
    String Terminal;
    float TotalCost;

    public int getSessionId() {
        return SessionId;
    }

    public void setSessionId(int SessionId) {
        this.SessionId = SessionId;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public String getTerminal() {
        return Terminal;
    }

    public void setTerminal(String Terminal) {
        this.Terminal = Terminal;
    }

    public float getTotalCost() {
        return TotalCost;
    }

    public void setTotalCost(float TotalCost) {
        this.TotalCost = TotalCost;
    }

    public SessionData(String UUID, String User, String StartTime, String EndTime, String Terminal, float TotalCost) {
        this.UUID = UUID;
        this.User = User;
        this.StartTime = StartTime;
        this.EndTime = EndTime;
        this.Terminal = Terminal;
        this.TotalCost = TotalCost;
    }
    
    
            
    
}
