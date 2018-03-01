package com.iflytek.entity;

import com.iflytek.entity.MDMData;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.List;

@XmlRootElement
public class ResponseMessage implements Serializable {
    private int id = 0;//-1:失败；0:成功;1:没有数据或其他
    private String message;
    private MDMData mdmData;
    private List<MDMData> mdmDataList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MDMData getMdmData() {
        return mdmData;
    }

    public void setMdmData(MDMData mdmData) {
        this.mdmData = mdmData;
    }

    public List<MDMData> getMdmDataList() {
        return mdmDataList;
    }

    public void setMdmDataList(List<MDMData> mdmDataList) {
        this.mdmDataList = mdmDataList;
    }

    public void makeSuccess() {
        this.id = 0;
        this.message = "OK";
    }

    public void makeFail() {
        this.id = -1;
        this.message = "Fail";
    }
}
