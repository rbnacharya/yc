/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.database;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Pavan Poudel
 */
@Entity
@Table(name = "tbl_terminal", catalog = "yellocafe", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblTerminal.findAll", query = "SELECT t FROM TblTerminal t"),
    @NamedQuery(name = "TblTerminal.findByTerminal", query = "SELECT t FROM TblTerminal t WHERE t.terminal = :terminal"),
    @NamedQuery(name = "TblTerminal.findByCompname", query = "SELECT t FROM TblTerminal t WHERE t.compname = :compname"),
    @NamedQuery(name = "TblTerminal.findByProfile", query = "SELECT t FROM TblTerminal t WHERE t.profile = :profile"),
    @NamedQuery(name = "TblTerminal.findByIPAddress", query = "SELECT t FROM TblTerminal t WHERE t.iPAddress = :iPAddress"),
    @NamedQuery(name = "TblTerminal.findByUsername", query = "SELECT t FROM TblTerminal t WHERE t.username = :username"),
    @NamedQuery(name = "TblTerminal.findByMACAddress", query = "SELECT t FROM TblTerminal t WHERE t.mACAddress = :mACAddress")})
public class TblTerminal implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Terminal")
    private String terminal;
    @Basic(optional = false)
    @Column(name = "Comp_name")
    private String compname;
    @Basic(optional = false)
    @Column(name = "Profile")
    private String profile;
    @Basic(optional = false)
    @Column(name = "IPAddress")
    private String iPAddress;
    @Basic(optional = false)
    @Column(name = "Username")
    private String username;
    @Basic(optional = false)
    @Column(name = "MACAddress")
    private String mACAddress;

    public TblTerminal() {
    }

    public TblTerminal(String terminal) {
        this.terminal = terminal;
    }

    public TblTerminal(String terminal, String compname, String profile, String iPAddress, String username, String mACAddress) {
        this.terminal = terminal;
        this.compname = compname;
        this.profile = profile;
        this.iPAddress = iPAddress;
        this.username = username;
        this.mACAddress = mACAddress;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        String oldTerminal = this.terminal;
        this.terminal = terminal;
        changeSupport.firePropertyChange("terminal", oldTerminal, terminal);
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        String oldCompname = this.compname;
        this.compname = compname;
        changeSupport.firePropertyChange("compname", oldCompname, compname);
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        String oldProfile = this.profile;
        this.profile = profile;
        changeSupport.firePropertyChange("profile", oldProfile, profile);
    }

    public String getIPAddress() {
        return iPAddress;
    }

    public void setIPAddress(String iPAddress) {
        String oldIPAddress = this.iPAddress;
        this.iPAddress = iPAddress;
        changeSupport.firePropertyChange("IPAddress", oldIPAddress, iPAddress);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        String oldUsername = this.username;
        this.username = username;
        changeSupport.firePropertyChange("username", oldUsername, username);
    }

    public String getMACAddress() {
        return mACAddress;
    }

    public void setMACAddress(String mACAddress) {
        String oldMACAddress = this.mACAddress;
        this.mACAddress = mACAddress;
        changeSupport.firePropertyChange("MACAddress", oldMACAddress, mACAddress);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (terminal != null ? terminal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblTerminal)) {
            return false;
        }
        TblTerminal other = (TblTerminal) object;
        if ((this.terminal == null && other.terminal != null) || (this.terminal != null && !this.terminal.equals(other.terminal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rpst.yc.server.ui.TblTerminal[ terminal=" + terminal + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
