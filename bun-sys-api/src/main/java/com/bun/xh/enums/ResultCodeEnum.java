package com.bun.xh.enums;

/**
 * Created by xin on 2018/4/6.
 */
public enum ResultCodeEnum {

    SUCCESS("0000","操作成功",0);

    String code;
    String message;
    Integer eFlag;

    ResultCodeEnum(String code, String message, Integer eFlag) {
        this.code = code;
        this.message = message;
        this.eFlag = eFlag;
    }

    public String getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }

    public Integer getEFlag(){
        return eFlag;
    }
}
