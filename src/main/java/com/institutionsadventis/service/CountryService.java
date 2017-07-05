package com.institutionsadventis.service;

import com.institutionsadventis.persistence.Country;
import com.institutionsadventis.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by salim on 7/3/2017.
 */
@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;


    public List<Country> getAllCountries(){
        return (List<Country>)countryRepository.findAll();
    }

    public Country getCountryById(int idCountry){
        return  countryRepository.findByIdcountry(idCountry);
    }

}
