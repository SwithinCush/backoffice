/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ts.pm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Class Package
 *
 * @author daibheid
 */
@Entity
@Table(name="PACKAGEXN")
public class Package {

    @Id
    @Column(name="PACKAGEXNID")
    private Integer id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="SHIPMENTXNREF")
    private Shipment shipment;
    
    @Column(name="TRACKINGNUMBER")
    private String trackingNumber;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Shipment getShipment()
    {
        return shipment;
    }

    public void setShipment(Shipment shipment)
    {
        this.shipment = shipment;
    }

    public String getTrackingNumber()
    {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber)
    {
        this.trackingNumber = trackingNumber;
    }
    
    
} 

