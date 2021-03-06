package com.itqiwen.hibernate.domain2;

import javax.persistence.*;

@Entity
public class Customer2 {

    @Id
    @GeneratedValue
    private Integer id;

    @Basic
    @Column(length = 12)
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
