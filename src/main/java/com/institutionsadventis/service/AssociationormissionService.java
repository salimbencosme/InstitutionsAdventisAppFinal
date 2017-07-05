package com.institutionsadventis.service;

import com.institutionsadventis.model.AssociationOrMissionModel;
import com.institutionsadventis.persistence.Associationormission;
import com.institutionsadventis.repositories.AssociationormissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by salim on 7/3/2017.
 */
@Service
public class AssociationormissionService {


    @Autowired
    private AssociationormissionRepository associationormissionRepository;

    @Autowired
    private UnionService unionService;


    public Associationormission getAssociationOrMission(int id){
        return  associationormissionRepository.findByIdassociationormission(id);
    }

    public List<Associationormission> getAllAssociationOrMissionActive(){
        return associationormissionRepository.findByActive(Byte.parseByte("1"));
    }


    public boolean verifyIfAssociationOrMissionIsRegisted(String name){
        return (associationormissionRepository.findByName(name) != null ?  true : false);
    }

    public Associationormission saveOrUpateAssociationOrMission(Associationormission associationormission){
          return associationormissionRepository.save(associationormission);
    }


    public List<AssociationOrMissionModel> getListOfAssociationOrMissionModel(){

        List<AssociationOrMissionModel> listTemp = new ArrayList<>();

        for(Associationormission associationormission : getAllAssociationOrMissionActive()){

            AssociationOrMissionModel associationOrMissionModel = new AssociationOrMissionModel();
            associationOrMissionModel.setAssociationormission(associationormission);
            associationOrMissionModel.setUnion(unionService.getUnionById(associationormission.getIdunion()));
            listTemp.add(associationOrMissionModel);
        }
        return listTemp;
    }



}
