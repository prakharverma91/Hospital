package com.hospital.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.dto.Hospital;
import com.hospital.dto.ResponseDTO;
import com.hospital.service.HospitalServiceImpl;

@RequestMapping("api/v1/")
@RestController
public class HospitalController {

    
    @Autowired
    private HospitalServiceImpl hospitalServiceImpl;

    public static Logger logger = LoggerFactory.getLogger(HospitalController.class);

    @GetMapping("hospitals")
    public ResponseDTO<List> getHospitals(){
        
        logger.info("Inside the getHospitals");
        List<Hospital> hospitals = hospitalServiceImpl.getAllHospitals();
        ResponseDTO responseDTO = new ResponseDTO();
        if(hospitals == null) {
            responseDTO.setMessage("Data is not available");
            responseDTO.setStatus("Failed");
        }else {
            responseDTO.setMessage("Hospitals list fetched successfully");
            responseDTO.setStatus("Success");
            responseDTO.setData(hospitals);
        }
        
        return responseDTO;
    }
    
    
    @GetMapping("hospitals/code/{code}")
    public ResponseDTO<List> getHospitalsByCode(@PathVariable String code){
        
        logger.info("Inside the getHospitals");
        
        if(code == null || StringUtils.isEmpty(code)) {
            return new ResponseDTO("code can not be null or empty","INVALID",null);
        }
        
        List<Hospital> hospitals = hospitalServiceImpl.getHospitalsByCode(code);
        ResponseDTO responseDTO = new ResponseDTO();
        if(hospitals == null) {
            responseDTO.setMessage("Data is not available");
            responseDTO.setStatus("Failed");
        }else {
            responseDTO.setMessage("Hospitals by code fetched successfully");
            responseDTO.setStatus("Success");
            responseDTO.setData(hospitals);
        }
        
        return responseDTO;
    }
    
    @GetMapping("hospitals/name/{name}/statename/{stateName}")
    public ResponseDTO<List> getHospitalsByNameAndStateName(@PathVariable String name,@PathVariable String stateName){
        
        logger.info("Inside the getHospitals");
        
        if(name == null || StringUtils.isEmpty(name)) {
            return new ResponseDTO("name can not be null or empty","INVALID",null);
        }else if(stateName == null || StringUtils.isEmpty(stateName)) {
            return new ResponseDTO("state Name can not be null or empty","INVALID",null);
        }
        
        List<Hospital> hospitals = hospitalServiceImpl.getHospitalsByNameAndStateName(name,stateName);
        ResponseDTO responseDTO = new ResponseDTO();
        if(hospitals == null) {
            responseDTO.setMessage("Data is not available");
            responseDTO.setStatus("Failed");
        }else {
            responseDTO.setMessage("Hospitals by name and state name fetched successfully");
            responseDTO.setStatus("Success");
            responseDTO.setData(hospitals);
        }
        
        return responseDTO;
    }
    
    @GetMapping("hospitals/type/{type}")
    public ResponseDTO<List> getHospitalsByType(@PathVariable String type){
        
        logger.info("Inside the getHospitals");
        
        if(type == null || StringUtils.isEmpty(type)) {
            return new ResponseDTO("type can not be null or empty","INVALID",null);
        }
        
        List<String> hospitals = hospitalServiceImpl.getHospitalsByType(type);
        ResponseDTO responseDTO = new ResponseDTO();
        if(hospitals == null) {
            responseDTO.setMessage("Data is not available");
            responseDTO.setStatus("Failed");
        }else {
            responseDTO.setMessage("Hospitals by type fetched successfully");
            responseDTO.setStatus("Success");
            responseDTO.setData(hospitals);
        }
        
        return responseDTO;
    }
}
