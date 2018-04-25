package com.bun.xh.biz.newshandler;

import com.bun.xh.vo.OverruleRequest;
import com.bun.xh.vo.OverruleResponse;
import org.springframework.stereotype.Service;

@Service
public class OverruleHandler extends AbstractNewsHandler{

    public OverruleResponse overrule(OverruleRequest request){
        OverruleResponse response = new OverruleResponse();
        return response;
    }
}