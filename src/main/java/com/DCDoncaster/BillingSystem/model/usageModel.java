package com.DCDoncaster.BillingSystem.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="readings")
public class usageModel {
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Id //set as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreadings")
    private Long id;

    @Column(name="useremail")
    private String useremail;

    @Column(name="reading")
    private String reading;

    @Column(name="date")
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getReading() {
        return reading;
    }

    public void setReading(String reading) {
        this.reading = reading;
    }


}
