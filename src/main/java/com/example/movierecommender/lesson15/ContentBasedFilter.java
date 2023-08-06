package com.example.movierecommender.lesson15;

import org.springframework.stereotype.Service;

@Service
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }

}
