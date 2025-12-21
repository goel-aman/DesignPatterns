package CommandDesignPattern;

public class LightReceiver {
    private String bulbStatus;

    public LightReceiver(String buldStatus) {
        this.bulbStatus = buldStatus;
    }

    public void switchOnbuld() {
        this.bulbStatus = "On";
    }

    public void switchOffBulb() {
        this.bulbStatus = "Off";
    }
}
