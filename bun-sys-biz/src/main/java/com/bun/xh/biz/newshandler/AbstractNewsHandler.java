package com.bun.xh.biz.newshandler;

import com.bun.xh.repository.db.service.NewLogService;
import com.bun.xh.repository.db.service.NewsService;
import com.bun.xh.repository.dto.NewsDTO;
import com.bun.xh.repository.dto.NewsLogDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AbstractNewsHandler {

    @Autowired
    private NewsService newsService;

    @Autowired
    private NewLogService newLogService;

    @Autowired
    protected TransactionTemplate transactionTemplate;

    protected NewsDTO selectNewsByNewsId(String newsId){
        NewsDTO newsDTO = new NewsDTO();
        newsDTO = newsService.selectNewsByNewsId(newsId);
        return newsDTO;
    }

    protected void summit(final NewsDTO newsDTO, final NewsLogDTO newsLogDTO){
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                newsService.insert(newsDTO);
                newLogService.insertLog(newsLogDTO);
            }
        });
    }

}