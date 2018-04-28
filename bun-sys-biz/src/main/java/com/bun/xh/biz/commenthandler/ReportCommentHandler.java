package com.bun.xh.biz.commenthandler;

import com.bun.xh.vo.ReportCommentRequest;
import com.bun.xh.vo.ReportCommentResponse;
import org.springframework.stereotype.Service;

@Service
public class ReportCommentHandler extends AbstractCommentHandler{

    public ReportCommentResponse reportComment(ReportCommentRequest request){
        ReportCommentResponse response = new ReportCommentResponse();

        return response;
    }
}