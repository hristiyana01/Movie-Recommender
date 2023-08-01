package com.example.movierecommender.lesson1;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

    @Override
    public boolean isLoggable(LogRecord logRecord) {
        return false;
    }
}
