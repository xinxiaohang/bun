package com.bun.xh.biz.newshandler;

import com.bun.xh.vo.DeleteNewsRequest;
import com.bun.xh.vo.DeleteNewsResponse;
import org.springframework.stereotype.Service;

@Service
public class DeleteNewsHandler extends AbstractNewsHandler{

    public DeleteNewsResponse deleteNews(DeleteNewsRequest request){
        DeleteNewsResponse response = new DeleteNewsResponse();

        return response;
    }
}