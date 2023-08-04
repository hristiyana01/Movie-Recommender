package com.example.movierecommender.lesson14;


import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;


public class RecommenderImplementation {

   // private Logger logger = LoggerFactory.getLogger(this.getClass());

//    @Inject
//    @Qualifier("CF")
    private Filter filter;

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter)
    {
        this.filter = filter;
    }

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

  //  @Autowired
    public RecommenderImplementation(Filter filter) {
        this.filter = filter;
    }
//    public RecommenderImplementation(ContentBasedFilter contentBasedFilter) {
//    }

//    public String[] recommendMovies(String movie) {
//        //ContentBasedFilter filter = new ContentBasedFilter();
//        //CollaborativeFilter filter = new CollaborativeFilter();
//        System.out.println("Name of the filter in use: " + filter + "\n");
//        String[] results = filter.getRecommendations("Finding Dory");
//
//        return results;
//    }
//
//    public void setFilter(Filter filter) {
//        logger.info("In RecommenderImplementation setter method..dependency injection");
//        this.filter = filter;
//    }
//    @PostConstruct
//    public void postConstruct() {
//        logger.info("In RecommenderImplementation postConstruct method");
//    }
//
//    @PreDestroy
//    public void preDestroy() {
//        //cleanup code
//        logger.info("In RecommenderImplementation preDestroy method");

//    public boolean getFilter() {
//    }
    }

