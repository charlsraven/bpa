package com.example.demo.model;

import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@RequiredArgsConstructor
public class Billie {
    @Id
    public String name;
    public String position;
    public String color;
    public String birthDate;
    public String image;
}
