package com.bun.xh.api;

import com.bun.xh.vo.PublishCommentResponse;
import com.bun.xh.vo.PublishCommentRequest;

/**
 * Created by xin on 2018/4/6.
 */
public interface CommentFacade {

    PublishCommentResponse publishComment(PublishCommentRequest request);


}
