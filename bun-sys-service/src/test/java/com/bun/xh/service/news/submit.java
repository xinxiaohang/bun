package com.bun.xh.service.news;

import com.bun.xh.api.NewsFacade;
import com.bun.xh.vo.ApproveRequest;
import com.bun.xh.vo.SubmitNewsRequest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by xin on 2018/4/23.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/spring/applicationContext-boot.xml")
public class submit {

    @Autowired
    protected NewsFacade newsFacade;

    @Test
    public void test(){
        SubmitNewsRequest submitNewsRequest = new SubmitNewsRequest();
        newsFacade.submitNews(submitNewsRequest);
    }
}
