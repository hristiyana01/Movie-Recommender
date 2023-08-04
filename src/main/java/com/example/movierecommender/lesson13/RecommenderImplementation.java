package com.example.movierecommender.lesson13;


import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import javax.inject.Named;

@Named
@Qualifier("CBF")
public class RecommenderImplementation {

   // private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Inject
    @Qualifier("CF")
    private Filter filter;

    public Filter getFilter() {
        return filter;
    }

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {

        //print the name of interface implementation being used
        System.out.println("\nName of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }

  //  @Autowired
//    public RecommenderImplementation(@Qualifier("collaborativeFilter") Filter filter) {
//        this.filter = filter;
//        System.out.println("Constructor invoked...");
//
//    }
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

