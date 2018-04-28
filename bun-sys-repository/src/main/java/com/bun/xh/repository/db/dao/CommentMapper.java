package com.bun.xh.repository.db.dao;

import com.bun.xh.repository.db.model.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {

    int insert(Comment record);

    int deleteCommByCommId(@Param("commentId") String commentId);

    Comment selectCommByCommId(@Param("commentId") String commentId);
}