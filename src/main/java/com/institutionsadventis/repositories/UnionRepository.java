package com.institutionsadventis.repositories;

import com.institutionsadventis.persistence.Union;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by salim on 6/25/2017.
 */
public interface UnionRepository extends CrudRepository<Union,Integer> {

    public List<Union> findByActive(boolean active);

    public Union findByIdunion(int idunion);

    public Union findByUnionname(String unionname);
}
