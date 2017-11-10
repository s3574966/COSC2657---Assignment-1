package com.rmit.s3574966.assignment1;

import java.util.Date;

/**
 * Created by thienho on 11/6/17.
 */

public class Users {
    private String email;
    private String password;
    private Date dob;
    private String gender;

    public Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Users(String email, String password, Date dob, String gender) {
        this.email = email;
        this.password = password;
        this.dob = dob;
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
