package com.bun.xh.api;

import com.bun.xh.vo.PublishRequest;
import com.bun.xh.vo.PublishResponse;
import com.bun.xh.vo.SubmitNewsRequest;
import com.bun.xh.vo.SubmitNewsResponse;

/**
 * Created by xin on 2018/4/7.
 */
public interface NewsFacade {

    SubmitNewsResponse submitNews(SubmitNewsRequest request);

    PublishResponse publishNews(PublishRequest request);

}
