package com.institutionsadventis.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by salim on 6/25/2017.
 */
@Entity
public class District {
    private int iddistrict;
    private boolean active;
    private String district;
    private int zone;
    private int idassociationormission;

    @Id
    @Column(name = "iddistrict")
    public int getIddistrict() {
        return iddistrict;
    }

    public void setIddistrict(int iddistrict) {
        this.iddistrict = iddistrict;
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
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "zone")
    public int getZone() {
        return zone;
    }

    public void setZone(int zone) {
        this.zone = zone;
    }

    @Basic
    @Column(name = "idassociationormission")
    public int getIdassociationormission() {
        return idassociationormission;
    }

    public void setIdassociationormission(int idassociationormission) {
        this.idassociationormission = idassociationormission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        District district1 = (District) o;

        if (iddistrict != district1.iddistrict) return false;
        if (active != district1.active) return false;
        if (zone != district1.zone) return false;
        if (idassociationormission != district1.idassociationormission) return false;
        if (district != null ? !district.equals(district1.district) : district1.district != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = iddistrict;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + zone;
        result = 31 * result + idassociationormission;
        return result;
    }
}
