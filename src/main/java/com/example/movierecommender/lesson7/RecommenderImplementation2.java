package com.example.movierecommender.lesson7;


import com.example.movierecommender.lesson15.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class RecommenderImplementation2 {

    @Autowired
    @Qualifier("CF")
    private Filter filter;
    public RecommenderImplementation2(Filter filter) {
        super();
        this.filter = filter;
    }
//    public RecommenderImplementation(ContentBasedFilter contentBasedFilter) {
//    }

    @Autowired
    @Qualifier("contentBasedFilter")
    public void setFilter(Filter filter) {
        this.filter = filter;
        System.out.println("Setter method invoked...");
    }

    public String[] recommendMovies(String movie) {
        //ContentBasedFilter filter = new ContentBasedFilter();
        //CollaborativeFilter filter = new CollaborativeFilter();
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}
