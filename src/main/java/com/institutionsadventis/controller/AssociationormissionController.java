package com.institutionsadventis.controller;

import com.institutionsadventis.model.AssociationOrMissionModel;
import com.institutionsadventis.persistence.Associationormission;
import com.institutionsadventis.service.AssociationormissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by salim on 7/3/2017.
 */

@RestController
public class AssociationormissionController {

    @Autowired
    private AssociationormissionService associationormissionService;



    @RequestMapping("/getallassociationormission")
    public List<Associationormission> getAllAssociationOrMission(){
        return associationormissionService.getAllAssociationOrMissionActive();

    }


    @RequestMapping("/getallassociationormissionmodel")
    public List<AssociationOrMissionModel> getAllAssociationOrMissionModel(){
        return associationormissionService.getListOfAssociationOrMissionModel();
    }




    @RequestMapping(method = RequestMethod.POST, value = "/saveassociationormission")
    public boolean saveNewAssoiationOrMission(@RequestBody Associationormission associationormission){

        boolean idSaved = associationormissionService.verifyIfAssociationOrMissionIsRegisted(associationormission.getName());

        if(!idSaved){
            associationormission.setActive(Byte.parseByte("1"));
            Associationormission associationormissionTemp = associationormissionService.saveOrUpateAssociationOrMission(associationormission);
            return  (associationormissionTemp != null ?  true : false);
        }else{
            return false;
        }

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/updateassociationormission")
    public boolean updateAssoiationOrMission(@RequestBody Associationormission associationormission){
            Associationormission associationormissionTemp = associationormissionService.saveOrUpateAssociationOrMission(associationormission);
            return  (associationormissionTemp != null ?  true : false);
    }


    @RequestMapping(method = RequestMethod.PUT, value = "/deleteassociationormission")
    public boolean deleteAssoiationOrMission(@RequestBody Associationormission associationormission){
        associationormission.setActive(Byte.parseByte("0"));
        Associationormission associationormissionTemp = associationormissionService.saveOrUpateAssociationOrMission(associationormission);
        return  (associationormissionTemp != null ?  true : false);
    }





}
