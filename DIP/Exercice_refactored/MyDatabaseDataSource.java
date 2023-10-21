package com.directi.training.dip.exercise_refactored;
public class MyDatabaseDataSource implements DataSource {
    private int count = 0;

    @Override
    public String getData() throws IOException {
        return String.valueOf(++count);
    }
}
