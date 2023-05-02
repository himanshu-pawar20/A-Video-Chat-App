package com.example.avideochatapp.Models;

public class Users {
    String profilepic, userName, phone, mail, password, userId, lastMessage;

    public Users(String profilepic, String userName, String phone, String mail, String password, String userId, String lastMessage) {
        this.profilepic = profilepic;
        this.userName = userName;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
        this.userId = userId;
        this.lastMessage = lastMessage;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Users(){}

    //SignUp Constructor
    public Users(String userName, String phone, String mail, String password) {

        this.userName = userName;
        this.phone = phone;
        this.mail = mail;
        this.password = password;
    }




    public String getProfilepic() {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }
}
