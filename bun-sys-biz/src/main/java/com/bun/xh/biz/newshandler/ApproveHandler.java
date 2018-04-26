package com.bun.xh.biz.newshandler;

import com.bun.xh.comm.enums.NewsStatusEnum;
import com.bun.xh.enums.ResultCodeEnum;
import com.bun.xh.repository.db.model.News;
import com.bun.xh.repository.db.model.NewsLog;
import com.bun.xh.repository.dto.NewsDTO;
import com.bun.xh.repository.dto.NewsLogDTO;
import com.bun.xh.vo.ApproveRequest;
import com.bun.xh.vo.ApproveResponse;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ApproveHandler extends AbstractNewsHandler{

    public ApproveResponse approve(ApproveRequest request){
        ApproveResponse response = new ApproveResponse();

        List<NewsDTO> newsDTOs = selectNewsByNewsIds(request.getNewsIds());
        if(CollectionUtils.isEmpty(newsDTOs)){
            response = (ApproveResponse)buildAbstractResponse(response, ResultCodeEnum.NEWS_LIST_NULL_ERROR);
            return response;
        }

        List<NewsLogDTO> newsLogDTOs = new ArrayList<NewsLogDTO>();
        for(NewsDTO newsDTO : newsDTOs ){
            newsDTO.setNewsStatus(NewsStatusEnum.APPROVE.getStatus());
            newsDTOs.add(newsDTO);

            NewsLogDTO newsLogDTO = new NewsLogDTO();
            newsLogDTO.setNewsId(newsDTO.getNewsId());
            newsLogDTO.setFromStatus(NewsStatusEnum.PUBLISH.getStatus());
            newsLogDTO.setToStatus(NewsStatusEnum.APPROVE.getStatus());
            newsLogDTO.setOptTime(new Date());
            newsLogDTO.setCheckUserId(request.getCheckedUserId());
            newsLogDTO.setCheckUserName(request.getCheckedUserName());
            newsLogDTO.setOverruleReason(null);
            newsLogDTO.setVersion(0);
            newsLogDTOs.add(newsLogDTO);
        }

        approveChange(newsDTOs,newsLogDTOs);

        response = (ApproveResponse)buildAbstractResponse(response,ResultCodeEnum.SUCCESS);
        return response;
    }
}