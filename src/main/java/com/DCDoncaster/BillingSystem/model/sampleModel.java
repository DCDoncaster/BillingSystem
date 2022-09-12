package com.DCDoncaster.BillingSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//This all tells it which database and in turn table to reference
@Entity
@Table(name = "accountdetails")
public class sampleModel {

    @Id //sets next item as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idaccount") //TODO Make sure this matches primary key in MYSQL
    private Long id;

    @Column(name="email")
    private String email;

    @Column(name="password")
    private String password;

    @Column(name="fullname")
    private String fullname;

    @Column(name="outstandingbalance")
    private Double outstandingbalance;

//generate getters and setters here if/when needed


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Double getOutstandingbalance() {
        return outstandingbalance;
    }

    public void setOutstandingbalance(Double outstandingbalance) {
        this.outstandingbalance = outstandingbalance;
    }
}
