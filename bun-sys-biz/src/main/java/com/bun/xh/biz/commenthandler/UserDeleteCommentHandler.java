package com.bun.xh.biz.commenthandler;

import com.bun.xh.vo.UserDeleteCommentRequest;
import com.bun.xh.vo.UserDeleteCommentResponse;
import org.springframework.stereotype.Service;

@Service
public class UserDeleteCommentHandler extends AbstractCommentHandler {

    public UserDeleteCommentResponse userDeleteComment(UserDeleteCommentRequest request){
        UserDeleteCommentResponse response = new UserDeleteCommentResponse();
        return response;
    }
}