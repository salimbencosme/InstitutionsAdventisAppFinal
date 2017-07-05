package com.institutionsadventis.controller;

import com.institutionsadventis.model.UnionModel;
import com.institutionsadventis.persistence.Union;
import com.institutionsadventis.service.UnionService;
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
public class UnionController {

    @Autowired
    private UnionService unionService;

    @RequestMapping("/getallunions")
    public List<Union> getAllUnions(){
        return unionService.getAllUnionsActive();
    }

    @RequestMapping("getallunionsmodel")
    public List<UnionModel> getListOfUnionModel(){
        return unionService.getListOfUnionModel();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/saveunion")
    public boolean saveNewUnion(@RequestBody Union union){
        boolean isSaved = (unionService.verifyIfUnionIsAreadySave(union.getUnionname()) != null ? true : false);
        if(!isSaved){
            union.setActive(true);
            Union unionTemp = unionService.saveOrUpdateUnion(union);
            return (unionTemp != null ? true : false);
        }else{
            return false;
        }

    }

    @RequestMapping(method = RequestMethod.PUT,value = "/updateunion")
    public boolean updateUnion(@RequestBody Union union){
            Union unionTemp = unionService.saveOrUpdateUnion(union);
            return (unionTemp != null ? true : false);

    }


    @RequestMapping(method = RequestMethod.PUT,value = "/deleteunion")
    public boolean deleteUnion(@RequestBody Union union){
        union.setActive(false);
        Union unionTemp = unionService.saveOrUpdateUnion(union);
        return (unionTemp != null ? true : false);

    }



}
