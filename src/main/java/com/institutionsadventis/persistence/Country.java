package com.institutionsadventis.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by salim on 6/25/2017.
 */
@Entity
public class Country {
    private int idcountry;
    private String country;

    @Id
    @Column(name = "idcountry")
    public int getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(int idcountry) {
        this.idcountry = idcountry;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Country country1 = (Country) o;

        if (idcountry != country1.idcountry) return false;
        if (country != null ? !country.equals(country1.country) : country1.country != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idcountry;
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }
}
