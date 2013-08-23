/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rpst.yc.database;

/**
 *
 * @author Pavan Poudel
 */
public class UserData {
    String LoginId;

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    String Password;
    String Identity;
    String IdNumber;
    String Fullname;
    String UserType;
    String Payment;
    float balance;
    String gender;
    int age;
    String phone;
    String email;
    String address;
    String description;
    String imagepath;

    public String getLoginId() {
        return LoginId;
    }

    public void setLoginId(String LoginId) {
        this.LoginId = LoginId;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    public String getFullname() {
        return Fullname;
    }

    public void setFullname(String Fullname) {
        this.Fullname = Fullname;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String UserType) {
        this.UserType = UserType;
    }

    public String getPayment() {
        return Payment;
    }

    public void setPayment(String Payment) {
        this.Payment = Payment;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagepath() {
        return imagepath;
    }

    public UserData(String LoginId, String Password, String Identity, String IdNumber, String Fullname, String UserType, String Payment, float balance, String gender, int age, String phone, String email, String address, String description, String imagepath) {
        this.LoginId = LoginId;
        this.Password = Password;
        this.Identity = Identity;
        this.IdNumber = IdNumber;
        this.Fullname = Fullname;
        this.UserType = UserType;
        this.Payment = Payment;
        this.balance = balance;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.description = description;
        this.imagepath = imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
    
    
}
