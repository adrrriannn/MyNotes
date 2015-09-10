package com.london.mynotes.form;

/**
 *
 * @author adrián
 */

import org.springframework.format.annotation.DateTimeFormat;
public class NoteForm {
    
    private Long id;
    
    private Double coordenateX;
    
    private Double coordenateY;
    
    private String image;
    
    private Double rating;

    private Long userId; 
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
