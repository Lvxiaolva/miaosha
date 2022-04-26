package com.lv.error;

public enum EmBusinessError implements CommonError{
    //通用错误类型00001
    PARAMETER_VALIDATIOM_ERROR(00001,"参数不合法"),
    UNKNOW_ERROR(00002,"未知错误"),

    //10000开头为用户信息相关错误定义
    USER_NOT_EXIST(10001,"用户不存在"),
    USER_LOGIN_FAIL(10002,"用户手机号或密码不正确"),

    ;

    private EmBusinessError(int errCode,String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    private int errCode;
    private String errMsg;


    @Override
    public int getErrCode() {
        return errCode;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public CommonError setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
}
