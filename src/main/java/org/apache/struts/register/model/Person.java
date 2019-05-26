package org.apache.struts.register.model;



import java.util.ArrayList;

public class Person {

    private String firstName;
    private String lastName;
    private String email;
    private String sports;
    private String gender;
    private int age;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "First Name: " + getFirstName() + " Last Name:  " + getLastName()
                + " Email:      " + getEmail() + " Age:      " + getAge() + " Sports:    " + getSports() + " Gender:     " + getGender();
    }

    /**
     * @return the sports
     */
    public String getSports() {
        return sports;
    }

    /**
     * @param sports the sports to set
     */
    public void setSports(String sports) {
        this.sports = sports;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

}
