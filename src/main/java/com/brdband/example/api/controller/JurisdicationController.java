package com.brdband.example.api.controller;

import com.brdband.example.api.models.CircleJurisdication;
import com.brdband.example.api.models.ResponseMessage;
import com.brdband.example.api.services.JurisdicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class JurisdicationController {

    @Autowired
    JurisdicationService jurisdicationServiceImpl;

    @RequestMapping(value = "/createCircle/",method = RequestMethod.POST)
    public ResponseEntity<ResponseMessage> createCircle(@RequestBody CircleJurisdication circleJurisdication){
        ResponseMessage responseMessage = new ResponseMessage();
        HttpStatus httpStatus = HttpStatus.CREATED;

        try {
            jurisdicationServiceImpl.createJurisdication(circleJurisdication);
            responseMessage.setStatusFlag(true);
            responseMessage.setStatusMessage("Created Successfully");
        }catch(Exception ex){
            responseMessage.setStatusFlag(true);
            responseMessage.setStatusMessage("Created Successfully");
            httpStatus = HttpStatus.EXPECTATION_FAILED;
        }

        return new ResponseEntity<>(responseMessage,httpStatus);
    }

    @RequestMapping(value = "/getCircleById",method = RequestMethod.GET)
    public ResponseEntity<ResponseMessage> getCircle(@RequestParam(value = "circleId") Long circleId){
        ResponseMessage responseMessage = new ResponseMessage();
        HttpStatus httpStatus = HttpStatus.OK;
        try{
            CircleJurisdication  circleJurisdication = jurisdicationServiceImpl.findCircleJurisdicationById(circleId);
            responseMessage.setStatusMessage("Success");
            responseMessage.setStatusFlag(true);
            responseMessage.setObjData(circleJurisdication);
        }catch(Exception ex){
            responseMessage.setStatusMessage("Failed: " + ex.getMessage());
            responseMessage.setStatusFlag(false);
            responseMessage.setObjData(null);
            httpStatus = HttpStatus.EXPECTATION_FAILED;
        }

        return new ResponseEntity<>(responseMessage,httpStatus);
    }

    @RequestMapping(value = "/getCircleByName",method = RequestMethod.GET)
    public ResponseEntity<ResponseMessage> getCircleName(@RequestParam(value = "circleName") String circleName){
        ResponseMessage responseMessage = new ResponseMessage();
        HttpStatus httpStatus = HttpStatus.OK;

        try{
            CircleJurisdication  circleJurisdication = jurisdicationServiceImpl.findCircleJurisdicationByName(circleName);
            responseMessage.setStatusMessage("Success");
            responseMessage.setStatusFlag(true);
            responseMessage.setObjData(circleJurisdication);
        }catch(Exception ex){
            responseMessage.setStatusMessage("Failed: " + ex.getMessage());
            responseMessage.setStatusFlag(false);
            responseMessage.setObjData(null);
            httpStatus = HttpStatus.EXPECTATION_FAILED;
        }

        return new ResponseEntity<>(responseMessage,httpStatus);
    }

    @RequestMapping(value = "/zipCodeExistsInCircleName",method = RequestMethod.GET)
    public ResponseEntity<ResponseMessage> zipCodeExistsInCircleName(@RequestParam(value = "circleName") String circleName, @RequestParam("zipCode") String zipCode){
        ResponseMessage responseMessage = new ResponseMessage();
        HttpStatus httpStatus = HttpStatus.OK;

        try{
            Boolean blFlg = jurisdicationServiceImpl.isZipcodeMappedWithCircle(zipCode,circleName);
            responseMessage.setStatusFlag(blFlg);
            if(blFlg) {
                responseMessage.setStatusMessage("Zipcode " + zipCode + " found in given Circle " + circleName);
            }else{
                responseMessage.setStatusMessage("Zipcode " + zipCode + " not found in given Circle " + circleName);
            }
        }catch(Exception ex){
            responseMessage.setStatusMessage("Failed: " + ex.getMessage());
            responseMessage.setStatusFlag(false);
            responseMessage.setObjData(null);
            httpStatus = HttpStatus.EXPECTATION_FAILED;
        }

        return new ResponseEntity<>(responseMessage,httpStatus);
    }

    @RequestMapping(value = "/zipCodeExistsInCircleId",method = RequestMethod.GET)
    public ResponseEntity<ResponseMessage> zipCodeExistsInCircleId(@RequestParam(value = "circleId") Long circleId, @RequestParam("zipCode") String zipCode){
        ResponseMessage responseMessage = new ResponseMessage();
        HttpStatus httpStatus = HttpStatus.OK;

        try{
            Boolean blFlg = jurisdicationServiceImpl.isZipcodeMappedWithCircle(zipCode,circleId);
            responseMessage.setStatusFlag(blFlg);
            if(blFlg) {
                responseMessage.setStatusMessage("Zipcode " + zipCode + " found in given Circle " + circleId);
            }else{
                responseMessage.setStatusMessage("Zipcode " + zipCode + " not found in given Circle " + circleId);
            }
        }catch(Exception ex){
            responseMessage.setStatusMessage("Failed: " + ex.getMessage());
            responseMessage.setStatusFlag(false);
            responseMessage.setObjData(null);
            httpStatus = HttpStatus.EXPECTATION_FAILED;
        }

        return new ResponseEntity<>(responseMessage,httpStatus);
    }

}
