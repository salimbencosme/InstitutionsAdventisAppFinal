package com.institutionsadventis.model;

import com.institutionsadventis.persistence.Associationormission;
import com.institutionsadventis.persistence.District;

import java.io.Serializable;

/**
 * Created by salim on 7/3/2017.
 */
public class DistrictModel implements Serializable {

    private District district;
    private Associationormission associationormission;

    public DistrictModel(){

    }

    public DistrictModel(District district, Associationormission associationormission) {
        this.district = district;
        this.associationormission = associationormission;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Associationormission getAssociationormission() {
        return associationormission;
    }

    public void setAssociationormission(Associationormission associationormission) {
        this.associationormission = associationormission;
    }
}
