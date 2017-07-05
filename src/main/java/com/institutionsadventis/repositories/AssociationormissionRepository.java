package com.institutionsadventis.repositories;

import com.institutionsadventis.persistence.Associationormission;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by salim on 6/25/2017.
 */
public interface AssociationormissionRepository extends CrudRepository<Associationormission,Integer> {



    public Associationormission findByIdassociationormission(int idassociationormission);

    public List<Associationormission> findByActive(byte active);

    public Associationormission findByName(String name);

}
