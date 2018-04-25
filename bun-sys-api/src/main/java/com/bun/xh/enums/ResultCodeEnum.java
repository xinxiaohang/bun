package com.bun.xh.enums;

import org.springframework.util.StringUtils;


/**
 * Created by xin on 2018/4/6.
 */
public enum  ResultCodeEnum {

    SUCCESS("0000","操作成功",0),

    //status
    STATUS_ERROR("1000","新闻状态不合法",0);

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

    public static Integer getEFlagByCode(String code){
        Integer eFlag = 0;
        if(StringUtils.isEmpty(code)){
            ResultCodeEnum[] enums = ResultCodeEnum.values();
            for(ResultCodeEnum codeEnum: enums){
                if(code.equals(codeEnum.getCode())){
                    eFlag = codeEnum.eFlag;
                }
            }
        }
        return eFlag;
    }
}
