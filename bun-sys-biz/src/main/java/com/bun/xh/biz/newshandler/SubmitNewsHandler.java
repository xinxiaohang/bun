package com.bun.xh.biz.newshandler;

import com.bun.xh.enums.ResultCodeEnum;
import com.bun.xh.repository.dto.NewsDTO;
import com.bun.xh.vo.SubmitNewsRequest;
import com.bun.xh.vo.SubmitNewsResponse;
import org.springframework.stereotype.Service;

@Service
public class SubmitNewsHandler extends AbstractNewsHandler{

    public SubmitNewsResponse submitNews(SubmitNewsRequest request){
        SubmitNewsResponse response = new SubmitNewsResponse();

        //幂等
        //NewsDTO newsDTO = request.getNewsId();

        response.setResultCode(ResultCodeEnum.SUCCESS.getCode());
        return response;
    }
}