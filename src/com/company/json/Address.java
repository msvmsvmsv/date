package com.company.json;

public class Address {
    private String streetAddress;
    private int houseNumber;

    public Address() {
    }

    public Address(String streetAddress, int houseNumber) {
        this.streetAddress = streetAddress;
        this.houseNumber = houseNumber;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }
}
