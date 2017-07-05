package com.institutionsadventis.model;

import com.institutionsadventis.persistence.Country;
import com.institutionsadventis.persistence.Union;

import java.io.Serializable;

/**
 * Created by salim on 7/3/2017.
 */
public class UnionModel implements Serializable {

    private Union union;
    private Country country;

    public UnionModel(){}

    public UnionModel(Union union, Country country) {
        this.union = union;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Union getUnion() {
        return union;
    }

    public void setUnion(Union union) {
        this.union = union;
    }
}
