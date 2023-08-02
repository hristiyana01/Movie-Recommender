package com.example.movierecommender.lesson11;


import com.example.movierecommender.lesson11.Filter;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Qualifier("CBF")
public class RecommenderImplementation {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

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

    public void setFilter(Filter filter) {
        logger.info("In RecommenderImplementation setter method..dependency injection");
        this.filter = filter;
    }
    @PostConstruct
    public void postConstruct() {
        logger.info("In RecommenderImplementation postConstruct method");
    }

    @PreDestroy
    public void preDestroy() {
        //cleanup code
        logger.info("In RecommenderImplementation preDestroy method");
    }
}
