package com.institutionsadventis.model;

import com.institutionsadventis.persistence.Associationormission;
import com.institutionsadventis.persistence.Union;

import java.io.Serializable;

/**
 * Created by salim on 7/3/2017.
 */
public class AssociationOrMissionModel implements Serializable {

    private Associationormission associationormission;
    private Union union;


    public AssociationOrMissionModel(){

    }

    public AssociationOrMissionModel(Associationormission associationormission, Union union) {
        this.associationormission = associationormission;
        this.union = union;
    }


    public Associationormission getAssociationormission() {
        return associationormission;
    }

    public void setAssociationormission(Associationormission associationormission) {
        this.associationormission = associationormission;
    }

    public Union getUnion() {
        return union;
    }

    public void setUnion(Union union) {
        this.union = union;
    }
}
