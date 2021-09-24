package com.example.backend.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Responsavel {
    @Id
    private Integer id;

    @Column
    private String name;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
