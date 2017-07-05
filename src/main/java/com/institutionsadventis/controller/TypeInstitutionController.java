package com.institutionsadventis.controller;

import com.institutionsadventis.model.InstitutionModel;
import com.institutionsadventis.persistence.Typeinstitutions;
import com.institutionsadventis.service.InstitutionServices;
import com.institutionsadventis.service.TypeinstitutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by salim on 6/23/2017.
 */


@RestController
public class TypeInstitutionController {


    @Autowired
    private TypeinstitutionService typeinstitutionService;

    @RequestMapping("/getalltype")
    public List<Typeinstitutions> loadAllTypeOfInstitution(){

        return typeinstitutionService.getAllTypeInstitutions();
    }

}
