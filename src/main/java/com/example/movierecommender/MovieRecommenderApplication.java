package com.example.movierecommender;

import com.example.movierecommender.lesson1.ContentBasedFilter;
import com.example.movierecommender.lesson1.RecommenderImplementation;
import com.example.movierecommender.lesson2.CollaborativeFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class MovieRecommenderApplication {

    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation(new CollaborativeFilter());
        String[] results = recommender.recommendMovies("Finding Dory");
        System.out.println(Arrays.toString(results));
        SpringApplication.run(MovieRecommenderApplication.class, args);
    }

}
