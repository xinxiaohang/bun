package com.bun.xh.service.news;

import com.bun.xh.api.NewsFacade;
import com.bun.xh.vo.ApproveRequest;
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
        ApproveRequest approveRequest = new ApproveRequest();
        newsFacade.approve(approveRequest);
    }
}
