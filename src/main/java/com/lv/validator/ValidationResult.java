package com.lv.validator;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class ValidationResult {
    //校验结果是否有错
    private boolean hsaError = false;

    //存放错误信息的map
    private Map<String,String> errorMsgMap = new HashMap<>();



    public boolean isHsaError() {
        return hsaError;
    }

    public void setHsaError(boolean hsaError) {
        this.hsaError = hsaError;
    }

    public Map<String, String> getErrorMsgMap() {
        return errorMsgMap;
    }

    public void setErrorMsgMap(Map<String, String> errorMsgMap) {
        this.errorMsgMap = errorMsgMap;
    }

    //实现通用的通过格式化字符串信息获取错误结果的msg方法
    public String getErrMsg(){
        return StringUtils.join(errorMsgMap.values().toArray(),",");
    }
}
