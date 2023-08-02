package com.example.movierecommender.lesson11;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements Filter {
    private static int instances = 0;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Movie movie;

    @PostConstruct
    public void postConstruct() {
        logger.info("In ContentBasedFilter constructor method");
    }
    public ContentBasedFilter() {
        instances++;
        System.out.println("ContentBasedFilter constructor called");
    }
    public Movie getMovie() {
        return movie;
    }

    public static int getInstances() {
        return instances;
    }

    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("In ContentBasedFilter preDestroy method");
    }
}
