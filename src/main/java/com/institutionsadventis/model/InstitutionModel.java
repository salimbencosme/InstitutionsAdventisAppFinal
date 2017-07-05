package com.institutionsadventis.model;

import com.institutionsadventis.persistence.District;
import com.institutionsadventis.persistence.Institutions;
import com.institutionsadventis.persistence.Typeinstitutions;

import java.io.Serializable;

/**
 * Created by salim on 6/25/2017.
 */
public class InstitutionModel implements Serializable {


    private Institutions institutions;
    private District district;
    private Typeinstitutions typeinstitutions;

    public InstitutionModel(){

    }

    public InstitutionModel(Institutions institutions, District district, Typeinstitutions typeinstitutions) {
        this.institutions = institutions;
        this.district = district;
        this.typeinstitutions = typeinstitutions;
    }

    public Institutions getInstitutions() {
        return institutions;
    }

    public void setInstitutions(Institutions institutions) {
        this.institutions = institutions;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Typeinstitutions getTypeinstitutions() {
        return typeinstitutions;
    }

    public void setTypeinstitutions(Typeinstitutions typeinstitutions) {
        this.typeinstitutions = typeinstitutions;
    }
}
