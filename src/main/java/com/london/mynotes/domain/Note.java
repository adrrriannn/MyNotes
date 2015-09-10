/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.domain;

/**
 *
 * @author adrián 
 */
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "note")
public class Note {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name= "id")
    private Long id;
    
    private String name;
    
    private Double coordenateX;
    
    private Double coordenateY;
    
    private String image;
    
    private Double rating;
    
    @OneToOne
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCoordenateX() {
        return coordenateX;
    }

    public void setCoordenateX(Double coordenateX) {
        this.coordenateX = coordenateX;
    }

    public Double getCoordenateY() {
        return coordenateY;
    }

    public void setCoordenateY(Double coordenateY) {
        this.coordenateY = coordenateY;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
        
}
