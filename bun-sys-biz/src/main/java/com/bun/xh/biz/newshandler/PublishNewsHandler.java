package com.bun.xh.biz.newshandler;

import com.bun.xh.vo.PublishNewsRequest;
import com.bun.xh.vo.PublishNewsResponse;
import org.springframework.stereotype.Service;

@Service
public class PublishNewsHandler extends AbstractNewsHandler{

    public PublishNewsResponse publishNews(PublishNewsRequest request){
        PublishNewsResponse response = new PublishNewsResponse();
        return response;
    }
}