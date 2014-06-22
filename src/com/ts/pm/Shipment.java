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
import org.apache.commons.lang3.StringUtils;

/**
 * Class Shipment
 *
 * @author daibheid
 */
@Entity
@Table(name="SHIPMENTXN")
public class Shipment {

    @Id
    @Column(name="SHIPMENTXNID")
    private Integer id;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="CUSTOMERREF")
    private Customer customer;
    
    @Column(name="SHIPTOFIRSTNAME", length=50)
    private String shipToFirstName;
    
    @Column(name="SHIPTOLASTNAME", length=50)
    private String shipToLastName;
    
    @Column(name="SHIPTOCOMPANYNAME", length=50)
    private String shipToCompanyName;
    
    @Column(name="SHIPTOADDRESS1", length=50)
    private String shipToAddress1;
    
    @Column(name="SHIPTOADDRESS2", length=50)
    private String shipToAddress2;
    
    @Column(name="SHIPTOADDRESS3", length=50)
    private String shipToAddress3;
    
    @ManyToOne
    @JoinColumn(name="SHIPTOPLACEREF")
    private Place shipToPlace;
    
    @ManyToOne
    @JoinColumn(name="SHIPTOZIPCODEREF")
    private Zipcode shipToZipcode;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setCustomer(Customer customer)
    {
        this.customer = customer;
    }

    public String getShipToFirstName()
    {
        return shipToFirstName;
    }

    public void setShipToFirstName(String shipToFirstName)
    {
        this.shipToFirstName = shipToFirstName;
    }

    public String getShipToLastName()
    {
        return shipToLastName;
    }

    public void setShipToLastName(String shipToLastName)
    {
        this.shipToLastName = shipToLastName;
    }

    public String getShipToCompanyName()
    {
        return shipToCompanyName;
    }

    public void setShipToCompanyName(String shipToCompanyName)
    {
        this.shipToCompanyName = shipToCompanyName;
    }

    public String getShipToAddress1()
    {
        return shipToAddress1;
    }

    public void setShipToAddress1(String shipToAddress1)
    {
        this.shipToAddress1 = shipToAddress1;
    }

    public String getShipToAddress2()
    {
        return shipToAddress2;
    }

    public void setShipToAddress2(String shipToAddress2)
    {
        this.shipToAddress2 = shipToAddress2;
    }

    public String getShipToAddress3()
    {
        return shipToAddress3;
    }

    public void setShipToAddress3(String shipToAddress3)
    {
        this.shipToAddress3 = shipToAddress3;
    }

    public Place getShipToPlace()
    {
        return shipToPlace;
    }

    public void setShipToPlace(Place shipToPlace)
    {
        this.shipToPlace = shipToPlace;
    }

    public Zipcode getShipToZipcode()
    {
        return shipToZipcode;
    }

    public void setShipToZipcode(Zipcode shipToZipcode)
    {
        this.shipToZipcode = shipToZipcode;
    }
    
    public String getShipToMailingAddress() {
        StringBuilder builder = new StringBuilder();
        
        if(StringUtils.isNotBlank(getShipToFirstName() + " " + getShipToLastName())) {
            builder.append(new String(getShipToFirstName() + " " + getShipToLastName()).trim());
            builder.append('\n');
        }
        
        if(StringUtils.isNotBlank(getShipToCompanyName())) {
            builder.append(getShipToCompanyName().trim());
            builder.append('\n');
        }
        
        if(StringUtils.isNotBlank(getShipToAddress1())) {
            builder.append(getShipToAddress1().trim());
            builder.append('\n');
        }
        
        if(StringUtils.isNotBlank(getShipToAddress2())) {
            builder.append(getShipToAddress2().trim());
            builder.append('\n');
        }
        
        if(StringUtils.isNotBlank(getShipToAddress3())) {
            builder.append(getShipToAddress3().trim());
            builder.append('\n');
        }
        
        builder.append(getShipToPlace().getCity());
        builder.append(", ");
        builder.append(getShipToZipcode().getStateDisplay());
        builder.append(' ');
        builder.append(getShipToZipcode().getZipDisplay());
        
        return builder.toString();
    }
} 

