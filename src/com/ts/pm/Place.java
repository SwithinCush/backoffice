/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.pm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Class Place
 *
 * @author daibheid
 */
@Entity
@Table(name="PLACE")
public class Place {

    @Id
    @Column(name="PLACEID")
    private Integer id;
    
    @Column(name="CITY", length=30)
    private String city;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }
    
    
} 

