package com.bun.xh.biz.newshandler;

import com.bun.xh.comm.enums.NewsStatusEnum;
import com.bun.xh.enums.ResultCodeEnum;
import com.bun.xh.repository.dto.NewsDTO;
import com.bun.xh.repository.dto.NewsLogDTO;
import com.bun.xh.vo.SubmitNewsRequest;
import com.bun.xh.vo.SubmitNewsResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;

@Service
public class SubmitNewsHandler extends AbstractNewsHandler{

    public SubmitNewsResponse submitNews(SubmitNewsRequest request){
        SubmitNewsResponse response = new SubmitNewsResponse();

        //幂等
        NewsDTO newsDTO = selectNewsByNewsId(request.getNewsId());

        if(!StringUtils.isEmpty(newsDTO)){
            if(0 == NewsStatusEnum.SUBMIT.getStatus().compareTo(newsDTO.getNewsStatus())){
                response.setResultCode(ResultCodeEnum.STATUS_ERROR.getCode());
                response.setResultCode(ResultCodeEnum.STATUS_ERROR.getMessage());
            }
            response.setResultCode(ResultCodeEnum.SUCCESS.getCode());
            response.setResultMessage(ResultCodeEnum.SUCCESS.getCode());
            return response;
        }

        //构造结构体
        NewsLogDTO newsLogDTO = null;
        makeNewsAndLog(newsDTO,newsLogDTO,request);

        summit(newsDTO,newsLogDTO);

        response.setResultCode(ResultCodeEnum.SUCCESS.getCode());
        return response;
    }

    //构造结构体
    private void makeNewsAndLog(
            NewsDTO newsDTO, NewsLogDTO newsLogDTO,SubmitNewsRequest request){
        newsDTO = new NewsDTO(request.getNewsId(),
                        request.getNewTitle(),
                        request.getNewDesc(),
                        request.getNewsPic(),
                        null,
                        NewsStatusEnum.SUBMIT.getStatus(),
                        request.getUserId(),
                        0,0,0,0);
        newsLogDTO = new NewsLogDTO(request.getNewsId(),
                0,0,new Date(),
                null,null,null,
                0);
    };
}