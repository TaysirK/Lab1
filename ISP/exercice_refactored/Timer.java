package com.directi.training.isp.exercise_refactored;

public class Timer {
    public void register(long timeOut, final CallbackHandler door) {
        java.util.Timer timerUtility = new java.util.Timer();
        timerUtility.schedule(new TimerTask() {
            @Override
            public void run() {
                door.timeOutCallback();
            }
        }, timeOut);
    }
}


