package com.institutionsadventis.repositories;

import com.institutionsadventis.persistence.Country;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by salim on 6/25/2017.
 */
public interface CountryRepository extends CrudRepository<Country,Integer> {

    public Country findByIdcountry(int idcountry);

}
