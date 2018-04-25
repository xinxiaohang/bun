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

        //构造结构体,提交新闻
        NewsLogDTO newsLogDTO = null;
        makeNewsAndLog(newsDTO,newsLogDTO,request);

        response.setResultCode(ResultCodeEnum.SUCCESS.getCode());
        response.setResultMessage(ResultCodeEnum.SUCCESS.getMessage());
        return response;
    }

    //构造结构体
    private void makeNewsAndLog(
            NewsDTO newsDTO, NewsLogDTO newsLogDTO,SubmitNewsRequest request){
        newsDTO = new NewsDTO();
        newsDTO.setNewsId(request.getNewsId());
        newsDTO.setNewsTitle(request.getNewTitle());
        newsDTO.setNewDesc(request.getNewDesc());
        newsDTO.setNewsPic(request.getNewsPic());
        newsDTO.setNewsType(null);
        newsDTO.setNewsStatus(NewsStatusEnum.SUBMIT.getStatus());
        newsDTO.setUserId(request.getUserId());
        newsDTO.setNewsReportTime(0);
        newsDTO.setNewsTreadTime(0);
        newsDTO.setNewsSupportTime(0);
        newsDTO.setVersion(0);

        newsLogDTO = new NewsLogDTO();
        newsLogDTO.setNewsId(request.getNewsId());
        newsLogDTO.setFromStatus(0);
        newsLogDTO.setToStatus(0);
        newsLogDTO.setOptTime(new Date());
        newsLogDTO.setCheckUserId(null);
        newsLogDTO.setCheckUserName(null);
        newsLogDTO.setOverruleReason(null);
        newsLogDTO.setVersion(0);

        summit(newsDTO,newsLogDTO);
    };
}