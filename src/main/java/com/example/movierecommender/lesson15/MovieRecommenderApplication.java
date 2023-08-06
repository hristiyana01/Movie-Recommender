package com.example.movierecommender.lesson15;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

@SpringBootApplication
@PropertySource("classpath:application.properties")

public class MovieRecommenderApplication {

    public static void main(String[] args) {

        //load the spring configuration file
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderApplication.class, args);

        //retrieve bean from the application context
        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        //display value read from external property file
        String favoriteMovie = recommender.getFavouriteMovie();
        System.out.println(favoriteMovie);

        //call method to get recommendations
        String[] result = recommender.recommendMovies(favoriteMovie);

        //display results
        System.out.println(Arrays.toString(result));

    }

}
