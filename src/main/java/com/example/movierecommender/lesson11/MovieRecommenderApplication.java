package com.example.movierecommender.lesson11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import java.util.Arrays;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.movierecommender.lesson10")
@ComponentScan(includeFilters = @ComponentScan.Filter (type = FilterType.REGEX,
        pattern = "com.example.movierecommender.lesson9"))
public class MovieRecommenderApplication {

    public static void main(String[] args) {
        //this is done automatically by Spring
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderApplication.class, args);
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        System.out.println(recommender);

        Movie movie1 = appContext.getBean(Movie.class);
        System.out.println(movie1);
        Movie movie2 = appContext.getBean(Movie.class);
        System.out.println(movie2);


    }

}
