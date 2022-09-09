package com.DCDoncaster.Database.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//This all tells it which database and in turn table to reference
@Entity
@Table(name = "characterdetails")   //TODO Pick a useful name
public class sampleModel {

    @Id //sets next item as primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idcharacterdetails") //TODO Pick a useful name/change based on MySQLs stuff
    private Long id;

    @Column(name="charactername")
    private String charactername;

    @Column(name="charactertpe")
    private String charactertpe;

    //right click and generate getters and setters for each
    //Charactertpe is a typo but due to schema being setup wrong on mySQL! Don't Change it

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharactername() {
        return charactername;
    }

    public void setCharactername(String charactername) {
        this.charactername = charactername;
    }

    public String getCharactertpe() {
        return charactertpe;
    }

    public void setCharactertpe(String charactertpe) {
        this.charactertpe = charactertpe;
    }
}
