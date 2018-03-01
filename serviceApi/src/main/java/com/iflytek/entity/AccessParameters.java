package com.iflytek.entity;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

/***
 * 访问接口参数类
 */
@XmlRootElement
public class AccessParameters implements Serializable {
    private String enterpriseId;//企业编码
    private String accountNo;//当前使用账号
    private String sbuid;//主对象ID
    private String snkey;
    private long vistTime;
    private MDMData params;

    public String getSnkey() {
        return snkey;
    }

    public void setSnkey(String snkey) {
        this.snkey = snkey;
    }

    public long getVistTime() {
        return vistTime;
    }

    public void setVistTime(long vistTime) {
        this.vistTime = vistTime;
    }

    public AccessParameters() {
    }

    public AccessParameters(String enterpriseId, String accountNo, String sbuid) {
        this.enterpriseId = enterpriseId;
        this.accountNo = accountNo;
        this.sbuid = sbuid;
    }

    public String getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getSbuid() {
        return sbuid;
    }

    public void setSbuid(String sbuid) {
        this.sbuid = sbuid;
    }

    public MDMData getParams() {
        return params;
    }

    public void setParams(MDMData params) {
        this.params = params;
    }
}
