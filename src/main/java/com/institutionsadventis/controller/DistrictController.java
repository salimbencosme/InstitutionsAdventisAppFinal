package com.institutionsadventis.controller;

import com.institutionsadventis.model.DistrictModel;
import com.institutionsadventis.persistence.District;
import com.institutionsadventis.persistence.Typeinstitutions;
import com.institutionsadventis.service.DistrictService;
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
public class DistrictController {


    @Autowired
    private DistrictService districtService;

    @RequestMapping("/getalldistrict")
    public List<District> loadAllDistrict(){

        return  districtService.getAllDistricts();
    }


    @RequestMapping("/getalldistrictmodel")
    public List<DistrictModel> loadAllDistrictModel(){

        return  districtService.getListOfDistrictModel();
    }


    @RequestMapping(method = RequestMethod.POST,value = "/savedistrict")
    public boolean saveNewDistrict(@RequestBody District district){
        boolean isSaved =  districtService.verifyIfNameOfDistrictIsAlreadySaved(district.getDistrict());
        if(!isSaved){
                district.setActive(true);
               District districtTemp =  districtService.saveOrUpdateDistrict(district);
            return (districtTemp != null ? true : false);
        }else{

            return false;
        }
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/updatedistrict")
    public boolean updateDistrict(@RequestBody District district){
            District districtTemp =  districtService.saveOrUpdateDistrict(district);
            return (districtTemp != null ? true : false);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/deletedistrict")
    public boolean delelteDistrict(@RequestBody District district){
        district.setActive(false);
        District districtTemp =  districtService.saveOrUpdateDistrict(district);
        return (districtTemp != null ? true : false);
    }



}
