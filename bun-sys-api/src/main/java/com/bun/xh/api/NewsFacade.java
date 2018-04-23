package com.bun.xh.api;

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

/**
 * Created by xin on 2018/4/7.
 */
public interface NewsFacade {

    SubmitNewsResponse submitNews(SubmitNewsRequest request);

    PublishNewsResponse publishNews(PublishNewsRequest request);

    ApproveResponse approve(ApproveRequest request);

    OverruleResponse overrule(OverruleRequest request);

    ReportResponse report(ReportRequest request);

    DeleteNewsResponse deleteNews(DeleteNewsRequest request);
}
