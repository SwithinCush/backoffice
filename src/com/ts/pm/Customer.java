
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
 * Class Customer
 *
 * @author daibheid
 */
@Entity
@Table(name="CUSTOMER")
public class Customer {

    @Id
    @Column(name="CUSTOMERID")
    private Integer id;
    
    @Column(name="NAMEPRE", length=4)
    private String namePre;
    
    @Column(name="FIRSTNAME", length=10)
    private String firstName;
    
    @Column(name="LASTNAME", length=20)
    private String lastName;
    
    @Column(name="COMPANYNAME", length=28)
    private String companyName;
    
    @Column(name="ADDRESS1", length=50)
    private String address1;
    
    @Column(name="ADDRESS2", length=50)
    private String address2;
    
    @Column(name="ADDRESS3", length=50)
    private String address3;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="ZIPTOPLACEREF")
    private ZipToPlace zipToPlace;
    
    @Column(name="DELETED")
    private boolean deleted;
    
    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNamePre()
    {
        return namePre;
    }

    public void setNamePre(String namePre)
    {
        this.namePre = namePre;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getCompanyName()
    {
        return companyName;
    }

    public void setCompanyName(String companyName)
    {
        this.companyName = companyName;
    }

    public String getAddress1()
    {
        return address1;
    }

    public void setAddress1(String address1)
    {
        this.address1 = address1;
    }

    public String getAddress2()
    {
        return address2;
    }

    public void setAddress2(String address2)
    {
        this.address2 = address2;
    }

    public String getAddress3()
    {
        return address3;
    }

    public void setAddress3(String address3)
    {
        this.address3 = address3;
    }

    public ZipToPlace getZipToPlace()
    {
        return zipToPlace;
    }

    public void setZipToPlace(ZipToPlace zipToPlace)
    {
        this.zipToPlace = zipToPlace;
    }

    //----
    
    public boolean isDeleted()
    {
        return deleted;
    }

    public void setDeleted(boolean deleted)
    {
        this.deleted = deleted;
    }
    
    public String getMailingAddress() {
        StringBuilder builder = new StringBuilder();
        
        if(StringUtils.isNotBlank(getFirstName() + " " + getLastName())) {
            builder.append(new String(getFirstName() + " " + getLastName()).trim());
            builder.append('\n');
        }
        
        if(StringUtils.isNotBlank(getCompanyName())) {
            builder.append(getCompanyName().trim());
            builder.append('\n');
        }
        
        if(StringUtils.isNotBlank(getAddress1())) {
            builder.append(getAddress1().trim());
            builder.append('\n');
        }
        
        if(StringUtils.isNotBlank(getAddress2())) {
            builder.append(getAddress2().trim());
            builder.append('\n');
        }
        
        if(StringUtils.isNotBlank(getAddress3())) {
            builder.append(getAddress3().trim());
            builder.append('\n');
        }
        
        builder.append(getZipToPlace().getPlace().getCity());
        builder.append(", ");
        builder.append(getZipToPlace().getZipcode().getStateDisplay());
        builder.append(' ');
        builder.append(getZipToPlace().getZipcode().getZipDisplay());
        
        return builder.toString();
    }
} 

