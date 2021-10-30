package com.hospital.service;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.dto.Hospital;

@Service
public class HospitalServiceImpl {

    @Autowired
    private FileReadServiceImpl fileService;

    public static Logger logger = LoggerFactory.getLogger(HospitalServiceImpl.class);

    public List<Hospital> getAllHospitals(){
        logger.info("Inside the service :getAllHospitals ");
        return fileService.getHospitals();
    }

    public List<Hospital> getHospitalsByCode(String stateCode){
        logger.info("Inside the service :getHospitalsByCode ");
        return fileService.getHospitalsByCode(stateCode);
    }
    
    public List<Hospital> getHospitalsByNameAndStateName(String name,String stateName){
        logger.info("Inside the service :getHospitalsByNameAndStateName ");
        return fileService.getHospitalsByNameAndStateName(name,stateName);
    }

    public List<String> getHospitalsByType(String type){
        logger.info("Inside the service :getHospitalsByType ");
        return fileService.getHospitalsByType(type);
    }

}
