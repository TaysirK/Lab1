package com.directi.training.dip.exercise_refactored;
public class EncodingModule {
    public void encode(DataSource dataSource, Encoder encoder) throws IOException {
        String data = dataSource.getData();
        String encodedData = encoder.encode(data);
        System.out.println("Encoded Data: " + encodedData);
    }

    public void encode(NetworkSource networkSource, Encoder encoder) throws IOException {
        String data = networkSource.fetchDataFromNetwork();
        String encodedData = encoder.encode(data);
        System.out.println("Encoded Network Data: " + encodedData);
    }
}
