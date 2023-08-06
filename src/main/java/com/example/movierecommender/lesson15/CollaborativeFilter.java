package com.example.movierecommender.lesson15;

import org.springframework.stereotype.Service;

@Service
public class CollaborativeFilter implements Filter {
    public String[] getRecommendations(String movie) {
        return new String[]{"Finding Nemo", "Ice Age", "Toy Story"};
    }
}
