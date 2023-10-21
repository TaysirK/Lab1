package com.directi.training.dip.exercise_refactored;
public class NetworkDataSource implements NetworkSource {
    @Override
    public String fetchDataFromNetwork() throws IOException {
        // ...
        return "Network Data";
    }
}