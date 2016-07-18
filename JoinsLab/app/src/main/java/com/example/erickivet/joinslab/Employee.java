package com.example.erickivet.joinslab;

/**
 * Created by erickivet on 7/17/16.
 */
public class Employee {

    private String ssn;
    private String firstName;
    private String lastName;
    private int birthYear;
    private String city;

    public Employee(String ssn, String firstName, String lastName, int birthYear, String city) {
        this.ssn = ssn;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.city = city;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {return birthYear;}

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getCity(){return city;}

    public void setCity (String city) {this.city = city;}

}
