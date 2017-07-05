package com.institutionsadventis.persistence;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by salim on 6/25/2017.
 */
@Entity
public class Typeinstitutions {
    private int idtypeinstitutions;
    private boolean active;
    private String typename;

    @Id
    @Column(name = "idtypeinstitutions")
    public int getIdtypeinstitutions() {
        return idtypeinstitutions;
    }

    public void setIdtypeinstitutions(int idtypeinstitutions) {
        this.idtypeinstitutions = idtypeinstitutions;
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
    @Column(name = "typename")
    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Typeinstitutions that = (Typeinstitutions) o;

        if (idtypeinstitutions != that.idtypeinstitutions) return false;
        if (active != that.active) return false;
        if (typename != null ? !typename.equals(that.typename) : that.typename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idtypeinstitutions;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (typename != null ? typename.hashCode() : 0);
        return result;
    }
}
