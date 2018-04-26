package com.bun.xh.service.api;

import com.alibaba.fastjson.JSON;
import com.bun.xh.api.NewsFacade;
import com.bun.xh.biz.newshandler.*;
import com.bun.xh.exception.BunServerException;
import com.bun.xh.exception.BunServiceException;
import com.bun.xh.service.convert.ExceptionConvert;
import com.bun.xh.vo.ApproveNewsRequest;
import com.bun.xh.vo.ApproveNewsResponse;
import com.bun.xh.vo.DeleteNewsRequest;
import com.bun.xh.vo.DeleteNewsResponse;
import com.bun.xh.vo.OverruleNewsRequest;
import com.bun.xh.vo.OverruleNewsResponse;
import com.bun.xh.vo.PublishNewsRequest;
import com.bun.xh.vo.PublishNewsResponse;
import com.bun.xh.vo.ReportNewsRequest;
import com.bun.xh.vo.ReportNewsResponse;
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

    @Autowired
    private PublishNewsHandler publishNewsHandler;

    @Autowired
    private ApproveHandler approveHandler;

    @Autowired
    private OverruleHandler overruleHandler;

    @Autowired
    private ReportNewsHandler reportNewsHandler;

    @Autowired
    private DeleteNewsHandler deleteNewsHandler;

    public SubmitNewsResponse submitNews(SubmitNewsRequest request) throws BunServerException,BunServiceException{
        SubmitNewsResponse response = new SubmitNewsResponse();
        try {
            LOG.info("新闻提交开始|请求报文" + JSON.toJSONString(request));
            response = submitNewsHandler.submitNews(request);
            LOG.info("新闻提交结束|返回报文" + JSON.toJSONString(response));
            ExceptionConvert.CreateException(response);
        }catch (Exception e){
           LOG.error("提交新闻异常",e);
            ExceptionConvert.throwException(e);
        }
        return response;
    }

    public PublishNewsResponse publishNews(PublishNewsRequest request) throws BunServerException,BunServiceException{
        PublishNewsResponse response = new PublishNewsResponse();

        try {
            LOG.info("新闻发布开始|请求报文" + JSON.toJSONString(request));
            response = publishNewsHandler.publishNews(request);
            LOG.info("新闻发布结束|返回报文" + JSON.toJSONString(response));
            ExceptionConvert.CreateException(response);
        }catch (Exception e){
            LOG.error("发布新闻异常",e);
            ExceptionConvert.throwException(e);
        }
        return response;
    }

    public ApproveNewsResponse approveNews(ApproveNewsRequest request) throws BunServerException,BunServiceException {
        ApproveNewsResponse response = new ApproveNewsResponse();

        try {
            LOG.info("新闻审核通过开始|请求报文" + JSON.toJSONString(request));
            response = approveHandler.approveNews(request);
            LOG.info("新闻审核通过结束|返回报文" + JSON.toJSONString(response));
            ExceptionConvert.CreateException(response);
        }catch (Exception e){
            LOG.error("新闻审核通过异常",e);
            ExceptionConvert.throwException(e);
        }
        return response;
    }

    public OverruleNewsResponse overruleNews(OverruleNewsRequest request) throws BunServerException,BunServiceException{
        OverruleNewsResponse response = new OverruleNewsResponse();

        try {
            LOG.info("新闻审核不通过开始|请求报文" + JSON.toJSONString(request));
            response = overruleHandler.overruleNews(request);
            LOG.info("新闻审核不通过结束|返回报文" + JSON.toJSONString(response));
            ExceptionConvert.CreateException(response);
        }catch (Exception e){
            LOG.error("新闻审核不通过异常",e);
            ExceptionConvert.throwException(e);
        }
        return response;
    }

    public ReportNewsResponse reportNews(ReportNewsRequest request)throws BunServerException,BunServiceException {
        ReportNewsResponse response = new ReportNewsResponse();

        try {
            LOG.info("举报新闻开始|请求报文" + JSON.toJSONString(request));
            response = reportNewsHandler.reportNews(request);
            LOG.info("举报新闻结束|返回报文" + JSON.toJSONString(response));
            ExceptionConvert.CreateException(response);
        }catch (Exception e){
            LOG.error("举报新闻异常",e);
            ExceptionConvert.throwException(e);
        }
        return response;
    }

    public DeleteNewsResponse deleteNews(DeleteNewsRequest request)throws BunServerException,BunServiceException {
        DeleteNewsResponse response = new DeleteNewsResponse();

        try {
            LOG.info("删除新闻开始|请求报文" + JSON.toJSONString(request));
            response = deleteNewsHandler.deleteNews(request);
            LOG.info("删除新闻结束|返回报文" + JSON.toJSONString(response));
            ExceptionConvert.CreateException(response);
        }catch (Exception e){
            LOG.error("删除新闻异常",e);
            ExceptionConvert.throwException(e);
        }
        return response;
    }
}
