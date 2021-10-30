# Hospital


configure the config.file.json=D:\\SpringBoot\\Hospital\\hospitals.json
path before use his service


Request Response:




output of 1st Question


http://localhost:8080/api/v1/hospitals


{"message":"Hospitals list fetched successfully","status":"Success","data":[{"hospid":"HOSP23G108570","hospname":"REGIONAL HOSPITAL KOTMA COLLIERY","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9407146406","hospaddress":"REGIONAL HOSPITAL KOTMA COLLIERY","hosptype":"Public"},{"hospid":"HOSP23G100602","hospname":"COMMUNITY HEALTH CENTER VENKATNAGAR","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9406775224","hospaddress":"423,venkatnagar river,post- jaitehri","hosptype":"Public"},{"hospid":"HOSP23G100450","hospname":"CHC FUNGA","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9406775224","hospaddress":"GRAM FUNGA","hosptype":"Public"},{"hospid":"HOSP23G100424","hospname":"COMUNITY HEALTH CENTER PARASI","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9406775224","hospaddress":"GRAM PARASI, LATAR ROAD","hosptype":"Public"},{"hospid":"22020025","hospname":"PRIMARY HEALTH CENTRE SANKARA","statecode":"22","state":"CHHATTISGARH","districtid":"646","district":"BALOD","hospcontactno":"9826643061","hospaddress":"SANKRA J","hosptype":"Private"},{"hospid":"22020026","hospname":"MAX HEALTH CARE SANKARA","statecode":"22","state":"CHHATTISGARH","districtid":"646","district":"BALOD","hospcontactno":"9826643061","hospaddress":"SANKRA J","hosptype":"Private"},{"hospid":"22020033","hospname":"PHC KURDI","statecode":"24","state":"RAJASTHAN","districtid":"649","district":"PALI","hospcontactno":"9479057739","hospaddress":"PHC KURDI","hosptype":"Public"}]}

-----------------------------------------------------------------



Output of 2rd Question

request 

http://localhost:8080/api/v1/hospitals/code/23
Response

{"message":"Hospitals by code fetched successfully","status":"Success","data":[{"hospid":"HOSP23G108570","hospname":"REGIONAL HOSPITAL KOTMA COLLIERY","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9407146406","hospaddress":"REGIONAL HOSPITAL KOTMA COLLIERY","hosptype":"Public"},{"hospid":"HOSP23G100602","hospname":"COMMUNITY HEALTH CENTER VENKATNAGAR","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9406775224","hospaddress":"423,venkatnagar river,post- jaitehri","hosptype":"Public"},{"hospid":"HOSP23G100450","hospname":"CHC FUNGA","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9406775224","hospaddress":"GRAM FUNGA","hosptype":"Public"},{"hospid":"HOSP23G100424","hospname":"COMUNITY HEALTH CENTER PARASI","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9406775224","hospaddress":"GRAM PARASI, LATAR ROAD","hosptype":"Public"}]}

-----------------------------------------------------------------


Output of 3rd Question

request 

http://localhost:8080/api/v1/hospitals/name/CHC%20FUNGA/statename/MADHYA%20PRADESH

Response

{"message":"Hospitals by name and state name fetched successfully","status":"Success","data":[{"hospid":"HOSP23G100450","hospname":"CHC FUNGA","statecode":"23","state":"MADHYA PRADESH","districtid":"390","district":"ANUPPUR","hospcontactno":"9406775224","hospaddress":"GRAM FUNGA","hosptype":"Public"}]}

-----------------------------------------------------------------

Output of 3rd Question


http://localhost:8080/api/v1/hospitals/type/private

{"message":"Hospitals by type fetched successfully","status":"Success","data":["PRIMARY HEALTH CENTRE SANKARA","MAX HEALTH CARE SANKARA"]}




