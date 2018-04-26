package com.bun.xh.biz.newshandler;

import com.bun.xh.biz.AbstractHandler;
import com.bun.xh.enums.ResultCodeEnum;
import com.bun.xh.repository.db.service.NewLogService;
import com.bun.xh.repository.db.service.NewsService;
import com.bun.xh.repository.dto.NewsDTO;
import com.bun.xh.repository.dto.NewsLogDTO;
import com.bun.xh.vo.AbstractResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AbstractNewsHandler extends AbstractHandler{

    @Autowired
    private NewsService newsService;

    @Autowired
    private NewLogService newLogService;

    @Autowired
    protected TransactionTemplate transactionTemplate;

    protected NewsDTO selectNewsByNewsId(String newsId){
        return newsService.selectNewsByNewsId(newsId);
    }

    protected void summitChange(final NewsDTO newsDTO, final NewsLogDTO newsLogDTO){
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                newsService.insert(newsDTO);
                newLogService.insertLog(newsLogDTO);
            }
        });
    }

    protected NewsDTO selectNewsByUserIdAndNewId(String userId,String newsId){
        return newsService.selectNewsByUserIdAndNewId(userId,newsId);
    }

    protected void publishChange (final NewsDTO newsDTO, final NewsLogDTO newsLogDTO){
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                newsService.updateByNewsId(newsDTO);
                newLogService.insertLog(newsLogDTO);
            }
        });
    }
}