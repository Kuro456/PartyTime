package com.pt.hz.partytime.Data;

/**
 * Created by hzaraba on 22/12/2014.
 */
public class Group {
    private int avatar;
    private String name;
    private Friend[] friends;

    public Group(int avatar, String name, Friend[] friends){
        this.avatar = avatar;
        this.name = name;
        this.friends = friends;
    }

    public Group(int avatar, String name){
        this.avatar = avatar;
        this.name = name;
    }

    public void addFriend(Friend friend){
        int size = friends.length;
        Friend[] tmp = new Friend[size+1];
        tmp[size] = friend;
        friends = tmp;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public void setFriends(Friend[] friends) {
        this.friends = friends;
    }

    public Friend[] getFriends() {
        return friends;
    }

    @Override
    public String toString() {
        return name;
    }
}