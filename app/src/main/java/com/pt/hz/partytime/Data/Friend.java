package com.pt.hz.partytime.Data;

/**
 * Created by hzaraba on 22/12/2014.
 */
public class Friend {
    private int avatar;
    private String firstname;
    private String lastname;

    public Friend(int avatar, String firstname, String lastname){
        this.avatar = avatar;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getAvatar() {
        return avatar;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return firstname +" "+ lastname ;
    }
}