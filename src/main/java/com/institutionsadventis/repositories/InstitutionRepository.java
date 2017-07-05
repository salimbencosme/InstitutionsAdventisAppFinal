package com.institutionsadventis.repositories;

import com.institutionsadventis.persistence.Institutions;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by salim on 6/25/2017.
 */
public interface InstitutionRepository extends CrudRepository<Institutions,Integer> {


    public List<Institutions> findByActive(boolean active);

    public Institutions findByName(String name);
}
