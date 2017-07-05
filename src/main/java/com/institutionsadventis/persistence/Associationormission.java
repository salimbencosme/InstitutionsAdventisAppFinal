package com.institutionsadventis.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by salim on 6/25/2017.
 */
@Entity
public class Associationormission {
    private int idassociationormission;
    private byte active;
    private String name;
    private boolean type;
    private int idunion;

    @Id
    @Column(name = "idassociationormission")
    public int getIdassociationormission() {
        return idassociationormission;
    }

    public void setIdassociationormission(int idassociationormission) {
        this.idassociationormission = idassociationormission;
    }

    @Basic
    @Column(name = "active")
    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
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
    @Column(name = "type")
    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Basic
    @Column(name = "idunion")
    public int getIdunion() {
        return idunion;
    }

    public void setIdunion(int idunion) {
        this.idunion = idunion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Associationormission that = (Associationormission) o;

        if (idassociationormission != that.idassociationormission) return false;
        if (active != that.active) return false;
        if (type != that.type) return false;
        if (idunion != that.idunion) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idassociationormission;
        result = 31 * result + (int) active;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type ? 1 : 0);
        result = 31 * result + idunion;
        return result;
    }
}
