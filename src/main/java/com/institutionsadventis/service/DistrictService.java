package com.institutionsadventis.service;

import com.institutionsadventis.model.DistrictModel;
import com.institutionsadventis.persistence.District;
import com.institutionsadventis.repositories.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by salim on 6/25/2017.
 */

@Service
public class DistrictService {

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private AssociationormissionService associationormissionService;

    public District getDistrictByid(int id){
        return districtRepository.findOne(id);
    }

    public List<District> getAllDistricts(){
        return districtRepository.findByActive(true);
    }


    public List<DistrictModel> getListOfDistrictModel(){

        List<DistrictModel> listTemp = new ArrayList<>();

        for(District district : districtRepository.findByActive(true)){

            DistrictModel districtModel = new DistrictModel();
           districtModel.setDistrict(district);
            districtModel.setAssociationormission(associationormissionService.getAssociationOrMission(district.getIdassociationormission()));
            listTemp.add(districtModel);
        }
        return listTemp;
    }


    public boolean verifyIfNameOfDistrictIsAlreadySaved(String districtName){
        return (  districtRepository.findByDistrict(districtName) != null ? true : false);
    }

    public District saveOrUpdateDistrict(District district){
        return districtRepository.save(district);
    }


}
