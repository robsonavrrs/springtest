package com.example.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PERSON")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PERSON_ID")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    public Person() {

    }

    public Person(String name) {
        super();
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer identifier) {
        this.id = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
