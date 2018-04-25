package com.bun.xh.repository.db.service;

import com.bun.xh.repository.db.dao.NewsMapper;
import com.bun.xh.repository.db.model.News;
import com.bun.xh.repository.dto.NewsDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * Created by xin on 2018/4/7.
 */
@Service
public class NewsService {

    @Autowired
    private NewsMapper newsMapper;

    public NewsDTO selectNewsByNewsId(String newsId){
        NewsDTO newsDTO = new NewsDTO();
        News news = newsMapper.selectNewsByNewsId(newsId);
        if(StringUtils.isEmpty(news)){
            return newsDTO;
        }
        BeanUtils.copyProperties(news,newsDTO);
        return newsDTO;
    }
}
