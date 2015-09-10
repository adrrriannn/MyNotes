/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.london.mynotes.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.Column;

/**
 *
 * @author adrián
 */
@Entity
@Table(name = "role", uniqueConstraints = { @UniqueConstraint(columnNames = { "rolename"})})
public class Role {
        
    private Long id;
    
    private String rolename;        
  
    @Id
    @GeneratedValue
    @Column(name = "id")
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    @Column(name = "rolename")
    public String getRoleName(){
        return rolename;
    }
    
    public void setRoleName(String rolename){
        this.rolename = rolename;
    }
    
    @Override
    public String toString(){
        return "Role [id=" + id + ", rolename" + rolename + "]";
    }
    
}
