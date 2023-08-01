package com.example.movierecommender.lesson1;

import com.example.movierecommender.lesson2.CollaborativeFilter;
import com.example.movierecommender.Filter;

public class RecommenderImplementation {
    //find similar movies using a content-based filter and then return the results.
    private Filter filter;
    public RecommenderImplementation(Filter filter) {
        super();
        this.filter = filter;
    }
    public RecommenderImplementation(ContentBasedFilter contentBasedFilter) {
    }

    public String[] recommendMovies(String movie) {
        ContentBasedFilter filter = new ContentBasedFilter();
       // CollaborativeFilter filter = new CollaborativeFilter();
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations(movie);



        return results;
    }

}
