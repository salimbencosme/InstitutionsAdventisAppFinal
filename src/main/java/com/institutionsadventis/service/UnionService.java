package com.institutionsadventis.service;

import com.institutionsadventis.model.UnionModel;
import com.institutionsadventis.persistence.Union;
import com.institutionsadventis.repositories.UnionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by salim on 7/3/2017.
 */

@Service
public class UnionService {


    @Autowired
    private UnionRepository unionRepository;

    @Autowired
    private CountryService countryService;


    public List<Union>  getAllUnionsActive(){
        return unionRepository.findByActive(true);
    }

    public Union getUnionById(int idunion){
        return unionRepository.findByIdunion(idunion);
    }

    public List<UnionModel> getListOfUnionModel(){

        List<UnionModel> listTemp = new ArrayList<>();

        for(Union union : getAllUnionsActive()){
            UnionModel unionModel = new UnionModel();
            unionModel.setUnion(union);
            unionModel.setCountry(countryService.getCountryById(union.getIdcountry()));
            listTemp.add(unionModel);
        }

        return listTemp;
    }

    public Union verifyIfUnionIsAreadySave(String unionName){
        return unionRepository.findByUnionname(unionName);
    }

    public Union saveOrUpdateUnion(Union union){
        return unionRepository.save(union);
    }



}
