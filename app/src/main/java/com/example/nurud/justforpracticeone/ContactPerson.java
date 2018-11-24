package com.example.nurud.justforpracticeone;

import java.io.Serializable;
import java.util.ArrayList;

public class ContactPerson implements Serializable {

    private String personName;
    private String phoneNumber;
    private int personImage;

    public ContactPerson() {
    }

    public ContactPerson(String personName, String phoneNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
    }

    public ContactPerson(String personName, String phoneNumber, int personImage) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
        this.personImage = personImage;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getPersonImage() {
        return personImage;
    }

    public void setPersonImage(int personImage) {
        this.personImage = personImage;
    }

    public ArrayList<ContactPerson> getAllPerson(){
        ArrayList<ContactPerson>persons = new ArrayList<>();
        persons.add(new ContactPerson("Sayed", "0155555"));
        persons.add(new ContactPerson("Saysssed", "01554555"));
        persons.add(new ContactPerson("Sayssed", "01545555"));
        persons.add(new ContactPerson("Saydded", "01555555"));
        persons.add(new ContactPerson("Sawwyed", "015584555"));
        persons.add(new ContactPerson("Savvyed", "01557555"));
        persons.add(new ContactPerson("Sayed", "01556555"));
        persons.add(new ContactPerson("Saywwssed", "015555555"));
        persons.add(new ContactPerson("Saysed", "015555555"));
        persons.add(new ContactPerson("Sayved", "015555555"));
        persons.add(new ContactPerson("Saybbed", "015555555"));
        persons.add(new ContactPerson("Sawwyed", "0155555"));
        persons.add(new ContactPerson("Sayebbd", "015554455"));
        persons.add(new ContactPerson("Sayemmd", "015559955"));
        persons.add(new ContactPerson("Sayuued", "015995555"));
        persons.add(new ContactPerson("Saykked", "015577555"));
        persons.add(new ContactPerson("kfgg", "015556655"));

        return persons;
    }
}
