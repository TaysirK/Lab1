package com.directi.training.dip.exercise_refactored;
public class FileDataSource implements DataSource {
    private final String filePath;

    public FileDataSource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public String getData() throws IOException {
        // ...
        return "File Data";
    }
}