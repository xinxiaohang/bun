package com.bun.xh.biz.commenthandler;

import com.bun.xh.vo.SupportCommentRequest;
import com.bun.xh.vo.SupportCommentResponse;
import org.springframework.stereotype.Service;

@Service
public class SupportCommentHandler  extends AbstractCommentHandler{

    public SupportCommentResponse supportComment(SupportCommentRequest request){
        SupportCommentResponse response = new SupportCommentResponse();
        return response;
    }
}