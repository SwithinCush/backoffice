/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.pm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Class ZipToPlace
 *
 * @author daibheid
 */
@Entity
@Table(name="ZIPTOPLACE")
public class ZipToPlace {

    @Id
    @Column(name="ZIPTOPLACEID")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name="ZIPCODEREF")
    private Zipcode zipcode;
   
    @ManyToOne
    @JoinColumn(name="PLACEREF")
    private Place place;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Zipcode getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(Zipcode zipcode)
    {
        this.zipcode = zipcode;
    }

    public Place getPlace()
    {
        return place;
    }

    public void setPlace(Place place)
    {
        this.place = place;
    }
    
    
} 

