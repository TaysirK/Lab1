package com.directi.training.ocp.exercise_refactored;

public interface Resource {
    int allocate();
    void free(int resourceId);
    void markBusy(int resourceId);
    void markFree(int resourceId);
}
