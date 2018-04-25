package com.bun.xh.biz.newshandler;

import com.bun.xh.vo.ApproveRequest;
import com.bun.xh.vo.ApproveResponse;
import org.springframework.stereotype.Service;

@Service
public class ApproveHandler extends AbstractNewsHandler{

    public ApproveResponse approve(ApproveRequest request){
        ApproveResponse response = new ApproveResponse();
        return response;
    }
}