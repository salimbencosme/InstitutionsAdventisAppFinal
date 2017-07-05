package com.institutionsadventis.persistence;

import javax.persistence.*;

/**
 * Created by salim on 6/25/2017.
 */
@Entity
@Table(name = "union", schema = "", catalog = "institutionsadventisdb")
public class Union {
    private int idunion;
    private boolean active;
    private String unionname;
    private int idcountry;

    @Id
    @Column(name = "idunion")
    public int getIdunion() {
        return idunion;
    }

    public void setIdunion(int idunion) {
        this.idunion = idunion;
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
    @Column(name = "unionname")
    public String getUnionname() {
        return unionname;
    }

    public void setUnionname(String unionname) {
        this.unionname = unionname;
    }

    @Basic
    @Column(name = "idcountry")
    public int getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(int idcountry) {
        this.idcountry = idcountry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Union that = (Union) o;

        if (idunion != that.idunion) return false;
        if (active != that.active) return false;
        if (idcountry != that.idcountry) return false;
        if (unionname != null ? !unionname.equals(that.unionname) : that.unionname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idunion;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (unionname != null ? unionname.hashCode() : 0);
        result = 31 * result + idcountry;
        return result;
    }
}
