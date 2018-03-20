package com.brdband.example.api.models;

public class ResponseMessage {

    private String statusMessage;
    private Boolean statusFlag;

    private Object objData;

    public Boolean getStatusFlag() {
        return statusFlag;
    }

    public void setStatusFlag(Boolean statusFlag) {
        this.statusFlag = statusFlag;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public Object getObjData() {
        return objData;
    }

    public void setObjData(Object objData) {
        this.objData = objData;
    }

}
