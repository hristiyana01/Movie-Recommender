package com.example.movierecommender.lesson15;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class RecommenderImplementation {

@Value(("${recommender.implementation.favoriteMovie: Finding Dory}"))
 String favouriteMovie;

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    @Autowired
    private Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter)
    {
        this.filter = filter;
    }

    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}

