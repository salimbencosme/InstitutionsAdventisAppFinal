package com.institutionsadventis.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by salim on 6/25/2017.
 */
@Entity
public class Institutions {
    private int idinstitutions;
    private boolean active;
    private String address;
    private String contactinformation;
    private String latitude;
    private String longitude;
    private String name;
    private int iddistrict;
    private int idtypeinstitutions;

    @Id
    @Column(name = "idinstitutions")
    public int getIdinstitutions() {
        return idinstitutions;
    }

    public void setIdinstitutions(int idinstitutions) {
        this.idinstitutions = idinstitutions;
    }

    @Basic
    @Column(name = "active")
    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "contactinformation")
    public String getContactinformation() {
        return contactinformation;
    }

    public void setContactinformation(String contactinformation) {
        this.contactinformation = contactinformation;
    }

    @Basic
    @Column(name = "latitude")
    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "iddistrict")
    public int getIddistrict() {
        return iddistrict;
    }

    public void setIddistrict(int iddistrict) {
        this.iddistrict = iddistrict;
    }

    @Basic
    @Column(name = "idtypeinstitutions")
    public int getIdtypeinstitutions() {
        return idtypeinstitutions;
    }

    public void setIdtypeinstitutions(int idtypeinstitutions) {
        this.idtypeinstitutions = idtypeinstitutions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Institutions that = (Institutions) o;

        if (idinstitutions != that.idinstitutions) return false;
        if (active != that.active) return false;
        if (iddistrict != that.iddistrict) return false;
        if (idtypeinstitutions != that.idtypeinstitutions) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (contactinformation != null ? !contactinformation.equals(that.contactinformation) : that.contactinformation != null)
            return false;
        if (latitude != null ? !latitude.equals(that.latitude) : that.latitude != null) return false;
        if (longitude != null ? !longitude.equals(that.longitude) : that.longitude != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idinstitutions;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (contactinformation != null ? contactinformation.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + iddistrict;
        result = 31 * result + idtypeinstitutions;
        return result;
    }


    @Override
    public String toString() {
        return "Institutions{" +
                "idinstitutions=" + idinstitutions +
                ", active=" + active +
                ", address='" + address + '\'' +
                ", contactinformation='" + contactinformation + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", name='" + name + '\'' +
                ", iddistrict=" + iddistrict +
                ", idtypeinstitutions=" + idtypeinstitutions +
                '}';
    }
}
