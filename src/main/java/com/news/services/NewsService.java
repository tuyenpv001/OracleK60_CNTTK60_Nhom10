package com.news.services;


import com.news.dao.NewsRepository;
import com.news.entities.News;
import com.news.requestmodels.NewsRequest;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Transactional
public class NewsService {
    private NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public void postNews(NewsRequest newsRequest){
        News news = new News();
        news.setTitle(newsRequest.getTitle());
        news.setBrief(newsRequest.getBrief());
        news.setContent_post(newsRequest.getContent_post());
        news.setUrlimage(newsRequest.getUrlimage());
        news.setDate_public(newsRequest.getDate_public());
        news.setTags(newsRequest.getTags());
        news.setCategory_id(newsRequest.getCategory_id());
        news.setView_post(newsRequest.getView_post());
        news.setStatus(newsRequest.getStatus());

        this.newsRepository.save(news);
    }
}











