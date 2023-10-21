ackage com.directi.training.isp.exercise_refactored;

public class Sensor {
    public void register(CallbackHandler door) {
        while (true) {
            if (isPersonClose()) {
                door.proximityCallback();
                break;
            }
        }
    }

    private boolean isPersonClose() {
        return new Random().nextBoolean();
    }
}
