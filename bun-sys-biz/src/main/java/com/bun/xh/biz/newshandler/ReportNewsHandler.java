package com.bun.xh.biz.newshandler;

import com.bun.xh.vo.ReportNewsRequest;
import com.bun.xh.vo.ReportNewsResponse;
import org.springframework.stereotype.Service;

@Service
public class ReportNewsHandler extends AbstractNewsHandler{

    public ReportNewsResponse reportNews(ReportNewsRequest request){
        ReportNewsResponse response = new ReportNewsResponse();

        return response;
    }

}