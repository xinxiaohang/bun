package com.bun.xh.service.news;

import com.bun.xh.api.NewsFacade;
import com.bun.xh.vo.PublishNewsRequest;
import com.bun.xh.vo.SubmitNewsRequest;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xin on 2018/4/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring/applicationContext-boot.xml")
public class AbstractNews {

    @Autowired
    protected NewsFacade newsFacade;

    protected SubmitNewsRequest buildSubmitNewsRequest(String userId,String newsId){
        SubmitNewsRequest request = new SubmitNewsRequest();
        request.setNewsId(newsId);
        request.setNewDesc("测试新闻内容");
        request.setNewTitle("测试新闻题目");
        request.setNewsPic("测试图片");
        request.setUserId(userId);
        return request;
    }

    protected PublishNewsRequest buildPublishNewsRequest(String userId,String newsId){
        PublishNewsRequest request = new PublishNewsRequest();
        request.setNewsId(newsId);
        request.setUserId(userId);
        return request;
    }
}
