package com.directi.training.dip.exercise_refactored;
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        DataSource dataSource = new MyDatabaseDataSource(); 
        NetworkSource networkSource = new NetworkDataSource();
        Encoder encoder = new Base64Encoder();
        EncodingModule encodingModule = new EncodingModule();

        encodingModule.encode(dataSource, encoder);
        encodingModule.encode(networkSource, encoder);
    }
}