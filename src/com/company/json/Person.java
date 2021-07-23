package com.company.json;

import com.fasterxml.jackson.annotation.JsonGetter;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;


import java.util.List;


@XmlRootElement
public class Person {
    private String firstName;
    private String lastName;
    private Address address;
    private List<String> phoneNumbers;

    public Person() {
    }

    public Person(String firstName, String lastName, Address address, List<String> phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumbers = phoneNumbers;
    }

    @JsonGetter("name")
    public String getFirstName() {
        return firstName;
    }

    @XmlAttribute
    public void setFirstName(String name) {
        this.firstName = name;
    }
    public String getLastName() {
        return lastName;
    }

    @XmlAttribute
    public void setLastName(String name) {
        this.lastName = name;
    }
    public Address getAddress() {
        return address;
    }
    @XmlElement
    public void setAddress(Address address) {
        this.address = address;
    }
//    public List<String> getPhoneNumbers() {
//        return phoneNumbers;
//    }
//    @XmlElement
//    public void setPhoneNumbers(List<String> phoneNumbers) {
//        this.phoneNumbers = phoneNumbers;
//    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
