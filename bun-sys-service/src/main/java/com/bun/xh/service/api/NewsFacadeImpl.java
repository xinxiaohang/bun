package com.bun.xh.service.api;

import com.alibaba.fastjson.JSON;
import com.bun.xh.api.NewsFacade;
import com.bun.xh.biz.newshandler.SubmitNewsHandler;
import com.bun.xh.vo.ApproveRequest;
import com.bun.xh.vo.ApproveResponse;
import com.bun.xh.vo.DeleteNewsRequest;
import com.bun.xh.vo.DeleteNewsResponse;
import com.bun.xh.vo.OverruleRequest;
import com.bun.xh.vo.OverruleResponse;
import com.bun.xh.vo.PublishNewsRequest;
import com.bun.xh.vo.PublishNewsResponse;
import com.bun.xh.vo.ReportRequest;
import com.bun.xh.vo.ReportResponse;
import com.bun.xh.vo.SubmitNewsRequest;
import com.bun.xh.vo.SubmitNewsResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xin on 2018/4/7.
 */
@Service
public class NewsFacadeImpl implements NewsFacade {

    private static Logger LOG = Logger.getLogger(NewsFacadeImpl.class);

    @Autowired
    private SubmitNewsHandler submitNewsHandler;

    public SubmitNewsResponse submitNews(SubmitNewsRequest request) {
        SubmitNewsResponse response = new SubmitNewsResponse();
        try {
            LOG.info("新闻提交开始|请求报文" + JSON.toJSONString(request));
            response = submitNewsHandler.submitNews(request);
            LOG.info("新闻提交结束|返回报文" + JSON.toJSONString(response));
        }catch (Exception e){

        }
        return response;
    }

    public PublishNewsResponse publishNews(PublishNewsRequest request) {
        return null;
    }

    public ApproveResponse approve(ApproveRequest request) {
        return null;
    }

    public OverruleResponse overrule(OverruleRequest request) {
        return null;
    }

    public ReportResponse report(ReportRequest request) {
        return null;
    }

    public DeleteNewsResponse deleteNews(DeleteNewsRequest request) {
        return null;
    }
}
