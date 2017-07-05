package com.institutionsadventis.controller;

import com.institutionsadventis.model.InstitutionModel;
import com.institutionsadventis.persistence.Institutions;
import com.institutionsadventis.persistence.Typeinstitutions;
import com.institutionsadventis.service.InstitutionServices;
import com.institutionsadventis.service.TypeinstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by salim on 6/23/2017.
 */


@RestController
public class InstitutionController {

    @Autowired
    private InstitutionServices institutionServices;



    @RequestMapping("/getallinstitution")
    public List<InstitutionModel> loadInstitutionsAvailable(){

        return institutionServices.getAllAviableInstitutions(true);
    }

    @RequestMapping(method = RequestMethod.POST, value = "saveinstitution")
    public  boolean saveNewInstitution(@RequestBody Institutions institutions){
        boolean saved = (institutionServices.verifyIfInstitutionisAlreadySaved(institutions.getName())  ==  null ?  false : true);
        if(!saved){
            institutions.setActive(true);
            Institutions institutionsTemp =  institutionServices.saveupdateInstitution(institutions);
            return (institutionsTemp == null ?  false: true);
        }
        return false;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "updateinstitution")
    public boolean updateInstitution(@RequestBody Institutions institutions){
            return (institutionServices.saveupdateInstitution(institutions)== null ?  false: true);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "deleteinstitution")
    public boolean deleteInstitution(@RequestBody Institutions institutions){

        institutions.setActive(false);
        return (institutionServices.saveupdateInstitution(institutions)== null ?  false: true);
    }


}
