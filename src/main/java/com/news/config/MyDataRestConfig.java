package com.news.config;

import com.news.entities.Category;
import com.news.entities.Comment;
import com.news.entities.News;
import com.news.entities.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    private String theAllowedOrigins = "http://localhost:5173";
    private String theAllowedOrigins_1 = "http://localhost:3000";


    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config,
                                                     CorsRegistry cors) {
        HttpMethod[] theUnsupportedActions = {
                HttpMethod.POST,
                HttpMethod.PATCH,
                HttpMethod.DELETE,
                HttpMethod.PUT};

        config.exposeIdsFor(News.class);
        config.exposeIdsFor(Category.class);
        config.exposeIdsFor(User.class);
        config.exposeIdsFor(Comment.class);
        enableHttpMethods(News.class, config, theUnsupportedActions);
        enableHttpMethods(Category.class, config, theUnsupportedActions);
        enableHttpMethods(User.class, config, theUnsupportedActions);
        enableHttpMethods(Comment.class, config, theUnsupportedActions);
        /* Configure CORS Mapping */
        cors.addMapping(config.getBasePath() + "/**")
                .allowedOrigins(theAllowedOrigins,theAllowedOrigins_1);
//        cors.addMapping(config.getBasePath() +"/**").allowedOrigins(getTheAllowedOrigins_1);
    }

    private void enableHttpMethods(Class theClass,
                                    RepositoryRestConfiguration config,
                                    HttpMethod[] theUnsupportedActions) {
        config.getExposureConfiguration()
                .forDomainType(theClass)
                .withItemExposure((metdata, httpMethods) ->
                        httpMethods.enable(theUnsupportedActions))
                .withCollectionExposure((metdata, httpMethods) ->
                        httpMethods.enable(theUnsupportedActions));
    }
}
