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
@Table(name = "tbl_user", catalog = "yellocafe", schema = "")
@NamedQueries({
    @NamedQuery(name = "TblUser.findAll", query = "SELECT t FROM TblUser t"),
    @NamedQuery(name = "TblUser.findByLoginID", query = "SELECT t FROM TblUser t WHERE t.loginID = :loginID"),
    @NamedQuery(name = "TblUser.findByPassword", query = "SELECT t FROM TblUser t WHERE t.password = :password"),
    @NamedQuery(name = "TblUser.findByFullName", query = "SELECT t FROM TblUser t WHERE t.fullName = :fullName"),
    @NamedQuery(name = "TblUser.findByUserType", query = "SELECT t FROM TblUser t WHERE t.userType = :userType"),
    @NamedQuery(name = "TblUser.findByPayment", query = "SELECT t FROM TblUser t WHERE t.payment = :payment"),
    @NamedQuery(name = "TblUser.findByBalance", query = "SELECT t FROM TblUser t WHERE t.balance = :balance"),
    @NamedQuery(name = "TblUser.findByImage", query = "SELECT t FROM TblUser t WHERE t.image = :image"),
    @NamedQuery(name = "TblUser.findByGender", query = "SELECT t FROM TblUser t WHERE t.gender = :gender"),
    @NamedQuery(name = "TblUser.findByAge", query = "SELECT t FROM TblUser t WHERE t.age = :age"),
    @NamedQuery(name = "TblUser.findByPhone", query = "SELECT t FROM TblUser t WHERE t.phone = :phone"),
    @NamedQuery(name = "TblUser.findByEmail", query = "SELECT t FROM TblUser t WHERE t.email = :email"),
    @NamedQuery(name = "TblUser.findByAddress", query = "SELECT t FROM TblUser t WHERE t.address = :address"),
    @NamedQuery(name = "TblUser.findByDescription", query = "SELECT t FROM TblUser t WHERE t.description = :description")})
public class TblUser implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LoginID")
    private String loginID;
    @Basic(optional = false)
    @Column(name = "Password")
    private String password;
    @Basic(optional = false)
    @Column(name = "FullName")
    private String fullName;
    @Basic(optional = false)
    @Column(name = "UserType")
    private String userType;
    @Basic(optional = false)
    @Column(name = "Payment")
    private String payment;
    @Basic(optional = false)
    @Column(name = "Balance")
    private float balance;
    @Basic(optional = false)
    @Column(name = "Image")
    private String image;
    @Basic(optional = false)
    @Column(name = "Gender")
    private String gender;
    @Basic(optional = false)
    @Column(name = "Age")
    private int age;
    @Basic(optional = false)
    @Column(name = "Phone")
    private String phone;
    @Basic(optional = false)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @Column(name = "Address")
    private String address;
    @Basic(optional = false)
    @Column(name = "Description")
    private String description;

    public TblUser() {
    }

    public TblUser(String loginID) {
        this.loginID = loginID;
    }

    public TblUser(String loginID, String password, String fullName, String userType, String payment, float balance, String image, String gender, int age, String phone, String email, String address, String description) {
        this.loginID = loginID;
        this.password = password;
        this.fullName = fullName;
        this.userType = userType;
        this.payment = payment;
        this.balance = balance;
        this.image = image;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.description = description;
    }

    public String getLoginID() {
        return loginID;
    }

    public void setLoginID(String loginID) {
        String oldLoginID = this.loginID;
        this.loginID = loginID;
        changeSupport.firePropertyChange("loginID", oldLoginID, loginID);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        String oldPassword = this.password;
        this.password = password;
        changeSupport.firePropertyChange("password", oldPassword, password);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        String oldFullName = this.fullName;
        this.fullName = fullName;
        changeSupport.firePropertyChange("fullName", oldFullName, fullName);
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        String oldUserType = this.userType;
        this.userType = userType;
        changeSupport.firePropertyChange("userType", oldUserType, userType);
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        String oldPayment = this.payment;
        this.payment = payment;
        changeSupport.firePropertyChange("payment", oldPayment, payment);
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        float oldBalance = this.balance;
        this.balance = balance;
        changeSupport.firePropertyChange("balance", oldBalance, balance);
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        String oldImage = this.image;
        this.image = image;
        changeSupport.firePropertyChange("image", oldImage, image);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        int oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        String oldDescription = this.description;
        this.description = description;
        changeSupport.firePropertyChange("description", oldDescription, description);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (loginID != null ? loginID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblUser)) {
            return false;
        }
        TblUser other = (TblUser) object;
        if ((this.loginID == null && other.loginID != null) || (this.loginID != null && !this.loginID.equals(other.loginID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.rpst.yc.server.ui.TblUser[ loginID=" + loginID + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
