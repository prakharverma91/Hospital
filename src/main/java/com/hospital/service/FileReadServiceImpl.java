package com.hospital.service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hospital.dto.Hospital;

@Service
public class FileReadServiceImpl {

    private List<Hospital> hospitals;

    @Autowired
    private ObjectMapper objectMapper;
    @Value("${config.file.json}")
    public String filePath;

    public static Logger logger = LoggerFactory.getLogger(FileReadServiceImpl.class);

    public List<Hospital> load() {

        String result="";
        logger.info("file path => {}",filePath);

        try {
            File file = new File(filePath);
            int length = (int)file.length();

            if(file.canRead()) {
                FileReader f = new FileReader(file);

                char[] ch = new char[length];
                f.read(ch);

                logger.info("File data : {}",new String(ch));
                result = new String(ch);
            }
        }catch(IOException e) {
            logger.error("Exception is : {}",e);
            return null;
        }
        
        return convertIntoObject(result);
    }

    
    public List<Hospital> convertIntoObject(String jsonString) {
        
        try {
            
            List<LinkedHashMap<String,String>> r= objectMapper.readValue(jsonString, List.class);
            
            List<Hospital> result = new ArrayList();
            
            for( LinkedHashMap<String,String> obj: r) {
                Hospital h = new Hospital();
                h.setDistrict(obj.get("district"));
                h.setDistrictid(obj.get("districtid"));
                h.setHospaddress(obj.get("hospaddress"));
                h.setHospcontactno(obj.get("hospcontactno"));
                h.setHospid(obj.get("hospid"));
                h.setHospname(obj.get("hospname"));
                h.setHosptype(obj.get("hosptype"));
                h.setState(obj.get("state"));
                h.setStatecode(obj.get("statecode"));
                result.add(h);
            }
            return result;
        }catch(Exception e) {
            logger.error("Exception during convert string into json : {}",e);
            return null;
        }
    }
    
    public List<Hospital> getHospitals(){
        
        if(hospitals == null) {
            return hospitals = load();  
        }
        
        return hospitals;
    }
    
    public List<Hospital> getHospitalsByCode(String code){
        
        List<Hospital> list = getHospitals();
        List<Hospital> hospitals= new ArrayList<>();
        
        if(list != null) {
            
            for(Hospital hospital : list) {
                if(code.equalsIgnoreCase(hospital.getStatecode())) {
                    hospitals.add(hospital);
                }
            }
        }

        return hospitals;
        
    }
    
    public List<Hospital> getHospitalsByNameAndStateName(String name,String stateName){
        
        List<Hospital> list = getHospitals();
        List<Hospital> hospitals= new ArrayList<>();
        
        if(list != null) {
            
            for(Hospital hospital : list) {
                if(name.equalsIgnoreCase(hospital.getHospname()) && stateName.equalsIgnoreCase(hospital.getState())) {
                    hospitals.add(hospital);
                }
            }
        }

        return hospitals;
    }

    
    public List<String> getHospitalsByType(String type){
    
        List<Hospital> list = getHospitals();
        List<String> hospitals= new ArrayList<>();
        
        if(list != null) {
            
            for(Hospital hospital : list) {
                if(type.equalsIgnoreCase(hospital.getHosptype())) {
                    hospitals.add(hospital.getHospname());
                }
            }
        }

        return hospitals;
        
    
    }
    
    
}
