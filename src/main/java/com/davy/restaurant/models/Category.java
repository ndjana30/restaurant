package com.davy.restaurant.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;


import java.sql.Blob;
import java.util.List;

@Entity
@Table(name="category")
public class Category {
    @Id
    @GeneratedValue
    private long id;
    private String name;


    public Category() {
    }


    public Category(long id, String name) {
        this.id = id;
        this.name = name;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}