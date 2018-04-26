package com.bun.xh.repository.db.dao;

import com.bun.xh.repository.db.model.News;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(News record);

    int insertSelective(News record);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    int updateByNewsId(News record);

    News selectByPrimaryKey(Long id);

    News selectNewsByNewsId(@Param("newsId") String newsId);

    News selectNewsByUserIdAndNewId(@Param("userId") String userId,
                                    @Param("newsId") String newsId);

    List<News> selectNewsByNewsIds(@Param("newsIds")List<String> newsIds);
}