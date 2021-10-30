package com.hospital.dto;

public class Hospital {

    
    private String hospid;
    private String hospname;
    private String statecode;
    private String state;
    private String districtid;
    private String district;
    private String hospcontactno;
    private String hospaddress;
    private String hosptype;
    
    
    public Hospital() {}
    
    public Hospital(String hospid, String hospname, String statecode, String state, String districtid, String district,
            String hospcontactno, String hospaddress, String hosptype) {
        super();
        this.hospid = hospid;
        this.hospname = hospname;
        this.statecode = statecode;
        this.state = state;
        this.districtid = districtid;
        this.district = district;
        this.hospcontactno = hospcontactno;
        this.hospaddress = hospaddress;
        this.hosptype = hosptype;
    }
    
    public String getHospid() {
        return hospid;
    }
    public void setHospid(String hospid) {
        this.hospid = hospid;
    }
    public String getHospname() {
        return hospname;
    }
    public void setHospname(String hospname) {
        this.hospname = hospname;
    }
    public String getStatecode() {
        return statecode;
    }
    public void setStatecode(String statecode) {
        this.statecode = statecode;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getDistrictid() {
        return districtid;
    }
    public void setDistrictid(String districtid) {
        this.districtid = districtid;
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district;
    }
    public String getHospcontactno() {
        return hospcontactno;
    }
    public void setHospcontactno(String hospcontactno) {
        this.hospcontactno = hospcontactno;
    }
    public String getHospaddress() {
        return hospaddress;
    }
    public void setHospaddress(String hospaddress) {
        this.hospaddress = hospaddress;
    }
    public String getHosptype() {
        return hosptype;
    }
    public void setHosptype(String hosptype) {
        this.hosptype = hosptype;
    }
        
        
}
