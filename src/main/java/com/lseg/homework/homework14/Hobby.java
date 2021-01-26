package com.lseg.homework.homework14;

import java.util.List;

public class Hobby {

    String hobbyName;
    int frequency;
    List<Address> addresses;

    public Hobby(String hobbyName, int frequency, List<Address> addresses) {
        this.hobbyName = hobbyName;
        this.frequency = frequency;
        this.addresses = addresses;
    }

    public String getHobbyName() {
        return hobbyName;
    }

    public void setHobbyName(String hobbyName) {
        this.hobbyName = hobbyName;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
