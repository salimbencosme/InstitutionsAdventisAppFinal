package com.institutionsadventis.controller;

import com.institutionsadventis.persistence.Country;
import com.institutionsadventis.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by salim on 7/3/2017.
 */

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;


    @RequestMapping("getallcontries")
    public List<Country> getAllContries(){
        return countryService.getAllCountries();
    }

}
