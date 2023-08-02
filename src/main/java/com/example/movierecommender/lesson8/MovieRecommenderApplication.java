package com.example.movierecommender.lesson8;

import com.example.movierecommender.lesson7.RecommenderImplementation;
import com.example.movierecommender.lesson7.RecommenderImplementation2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderApplication {

    public static void main(String[] args) {
        //this is done automatically by Spring
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderApplication.class, args);

//        CollaborativeFilter cf1 = appContext.getBean(CollaborativeFilter.class);
//        CollaborativeFilter cf2 = appContext.getBean(CollaborativeFilter.class);
//        CollaborativeFilter cf3 = appContext.getBean(CollaborativeFilter.class);
//
//        System.out.println(cf1);
//        System.out.println(cf2);
//        System.out.println(cf3);
//
//        //RecommenderImplementation injects dependency using constructor
//        System.out.println("\n*************************************************");
//        System.out.println("Calling getBean() on RecommenderImplementation");
//        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);
//        String[] result = recommender.recommendMovies("Finding Dory");
//        System.out.println(Arrays.toString(result));
//
//        //RecommenderImplementation2 injects dependency using setter method
//        System.out.println("\n*************************************************");
//        System.out.println("Calling getBean() on RecommenderImplementation2");
//        RecommenderImplementation2 recommender2 = appContext.getBean(RecommenderImplementation2.class);
//        result = recommender2.recommendMovies("Finding Dory");
//        System.out.println(Arrays.toString(result));

    }

}
