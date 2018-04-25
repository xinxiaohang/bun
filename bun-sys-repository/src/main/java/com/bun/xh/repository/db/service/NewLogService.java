package com.bun.xh.repository.db.service;

import com.bun.xh.repository.db.dao.NewsLogMapper;
import com.bun.xh.repository.db.model.NewsLog;
import com.bun.xh.repository.dto.NewsLogDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xin on 2018/4/7.
 */
@Service
public class NewLogService {

    @Autowired
    private NewsLogMapper newsLogMapper;

    public void insertLog(NewsLogDTO newsLogDTO){
        NewsLog newsLog = new NewsLog();
        BeanUtils.copyProperties(newsLogDTO,newsLog);
        newsLogMapper.insert(newsLog);
    }
}
