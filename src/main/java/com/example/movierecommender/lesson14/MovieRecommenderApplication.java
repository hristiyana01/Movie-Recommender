package com.example.movierecommender.lesson14;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

//@SpringBootApplication

public class MovieRecommenderApplication {

    public static void main(String[] args) {
        //this is done automatically by Spring
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("appContext.xml");
        RecommenderImplementation recommender = appContext.getBean("recommenderImplementation",RecommenderImplementation.class);

        //call method to get recommendations
        String[] result = recommender.recommendMovies("Finding Dory");

        //display results
        System.out.println(Arrays.toString(result));

       // appContext.close();
    }

}
