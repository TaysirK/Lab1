package com.directi.training.dip.exercise_refactored;
public class Base64Encoder implements Encoder {
    @Override
    public String encode(String input) {
        return java.util.Base64.getEncoder().encodeToString(input.getBytes());
    }
}