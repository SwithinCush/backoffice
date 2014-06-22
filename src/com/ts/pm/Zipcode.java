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
 * Class Zipcode
 *
 * @author daibheid
 */
@Entity
@Table(name="ZIPCODE")
public class Zipcode {
@Id
    @Column(name="ZIPCODEID")
    private Integer id;
    
    @Column(name="ZIPDISPLAY", length=15)
    private String zipDisplay;
    
    @Column(name="STATEDISPLAY", length=25)
    private String stateDisplay;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getZipDisplay()
    {
        return zipDisplay;
    }

    public void setZipDisplay(String zipDisplay)
    {
        this.zipDisplay = zipDisplay;
    }

    public String getStateDisplay()
    {
        return stateDisplay;
    }

    public void setStateDisplay(String stateDisplay)
    {
        this.stateDisplay = stateDisplay;
    }
    
} 

