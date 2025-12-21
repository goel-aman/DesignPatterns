package CommandDesignPattern;

public class LightOffCommand implements CommandInterface {
    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOffBulb();
    }

    @Override
    public void undo() {
        light.switchOnbuld();
    }
    
}
