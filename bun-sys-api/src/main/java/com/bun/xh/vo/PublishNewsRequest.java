package com.bun.xh.vo;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by xin on 2018/4/22.
 */
public class PublishNewsRequest {

    @NotEmpty
    private String userId;
    @NotEmpty
    private String newsId;
}
