package com.institutionsadventis.service;

import com.institutionsadventis.model.InstitutionModel;
import com.institutionsadventis.persistence.Institutions;
import com.institutionsadventis.persistence.Typeinstitutions;
import com.institutionsadventis.repositories.InstitutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by salim on 6/25/2017.
 */

@Service
public class InstitutionServices {


    @Autowired
    private InstitutionRepository institutionRepository;

    @Autowired
    private DistrictService districtService;

    @Autowired
    private TypeinstitutionService typeinstitutionService ;

    public List<InstitutionModel> getAllAviableInstitutions(boolean active){

        List<InstitutionModel> temp = new ArrayList<>();

        for(Institutions institution : institutionRepository.findByActive(true)){

            InstitutionModel institutionModel = new InstitutionModel();
            institutionModel.setInstitutions(institution);
            institutionModel.setDistrict(districtService.getDistrictByid(institution.getIddistrict()));
            institutionModel.setTypeinstitutions(typeinstitutionService.getTypeInstitutionById(institution.getIdtypeinstitutions()));
            temp.add(institutionModel);
        }
        return (temp) ;
    }


     public Institutions verifyIfInstitutionisAlreadySaved(String name){

        return institutionRepository.findByName(name);
     }

    public Institutions saveupdateInstitution(Institutions institutions){

        return institutionRepository.save(institutions);
    }





}
