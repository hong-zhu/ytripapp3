package com.ytripapp.api.client.v2.domain;

public class Guest extends User {

    private static final long serialVersionUID = 6160886345890923809L;

    public Guest() {
        group = Group.Guest;
    }

}
