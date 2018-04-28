package com.bun.xh.biz.commenthandler;

import com.bun.xh.vo.TreadCommentRequest;
import com.bun.xh.vo.TreadCommentResponse;
import org.springframework.stereotype.Service;

@Service
public class TreadCommentHandler extends AbstractCommentHandler {

    public TreadCommentResponse treadComment(TreadCommentRequest request){
        TreadCommentResponse response = new TreadCommentResponse();
        return response;
    }

}