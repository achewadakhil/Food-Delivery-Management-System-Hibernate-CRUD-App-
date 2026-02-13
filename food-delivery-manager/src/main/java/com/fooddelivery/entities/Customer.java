package com.fooddelivery.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Customer {
    

    @Id
    private int id;
    private String name;

    
    @Override
    public String toString() {
        return "Customer [id=" + id + ", name=" + name + "]";
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}
