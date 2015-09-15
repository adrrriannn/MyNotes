package com.london.mynotes.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 *
 * @author adrián
 */
@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint( columnNames = {"username"})})
public class User {
       
    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;
    
    private String username;
    
    private String password;
    
    private String avatar;
    
    private String email;
    
    @OneToOne
    private Role role;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    @Override
    public String toString(){
        return "User [id = " + id + ", username = " + username + ", password = " +
                password + ", avatar = " + avatar + ", email = " + email + "]";
                
    }
}
