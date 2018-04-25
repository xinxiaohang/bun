package com.bun.xh.api;

import com.bun.xh.exception.BunServerException;
import com.bun.xh.exception.BunServiceException;
import com.bun.xh.vo.ApproveRequest;
import com.bun.xh.vo.ApproveResponse;
import com.bun.xh.vo.DeleteNewsRequest;
import com.bun.xh.vo.DeleteNewsResponse;
import com.bun.xh.vo.OverruleRequest;
import com.bun.xh.vo.OverruleResponse;
import com.bun.xh.vo.PublishNewsRequest;
import com.bun.xh.vo.PublishNewsResponse;
import com.bun.xh.vo.ReportNewsRequest;
import com.bun.xh.vo.ReportNewsResponse;
import com.bun.xh.vo.SubmitNewsRequest;
import com.bun.xh.vo.SubmitNewsResponse;

/**
 * Created by xin on 2018/4/7.
 */
public interface NewsFacade {

    SubmitNewsResponse submitNews(SubmitNewsRequest request) throws BunServerException,BunServiceException;

    PublishNewsResponse publishNews(PublishNewsRequest request)throws BunServerException,BunServiceException;

    ApproveResponse approve(ApproveRequest request)throws BunServerException,BunServiceException;

    OverruleResponse overrule(OverruleRequest request)throws BunServerException,BunServiceException;

    ReportNewsResponse reportNews(ReportNewsRequest request)throws BunServerException,BunServiceException;

    DeleteNewsResponse deleteNews(DeleteNewsRequest request)throws BunServerException,BunServiceException;
}
