package com.institutionsadventis.service;

import com.institutionsadventis.persistence.Typeinstitutions;
import com.institutionsadventis.repositories.TypeinstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by salim on 6/25/2017.
 */

@Service
public class TypeinstitutionService {

    @Autowired
    private TypeinstitutionRepository typeinstitutionRepository;


    public Typeinstitutions getTypeInstitutionById(int id){
        return typeinstitutionRepository.findOne(id);
    }
     public List<Typeinstitutions> getAllTypeInstitutions(){

         return (List<Typeinstitutions>) typeinstitutionRepository.findAll();
     }


}
