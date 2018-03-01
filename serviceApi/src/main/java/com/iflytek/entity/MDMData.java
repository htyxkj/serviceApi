package com.iflytek.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/***
 * 主数据对象
 */
public class MDMData implements Serializable {
    public Map<String, Object> mdmParams;//主数据参数

    public Map<String, Object> getMdmParams() {
        return mdmParams;
    }

    public void setMdmParams(HashMap<String, Object> mdmParams) {
        this.mdmParams = mdmParams;
    }

    public void addParams(String key, Object v) {
        if (mdmParams == null)
            mdmParams = new HashMap<String, Object>();
        mdmParams.put(key, v);
    }
}
