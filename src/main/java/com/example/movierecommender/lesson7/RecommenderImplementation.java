package com.example.movierecommender.lesson7;


import com.example.movierecommender.lesson8.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("CBF")
public class RecommenderImplementation {
    //find similar movies using a content-based filter and then return the results.
    //Filter is a dependency of RecommenderImplementation
    @Qualifier("CF")
    private Filter filter;
    @Autowired
    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
        this.filter = filter;
        System.out.println("Constructor invoked...");

    }
//    public RecommenderImplementation(ContentBasedFilter contentBasedFilter) {
//    }

    public String[] recommendMovies(String movie) {
        //ContentBasedFilter filter = new ContentBasedFilter();
        //CollaborativeFilter filter = new CollaborativeFilter();
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

}
