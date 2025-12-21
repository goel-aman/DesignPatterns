package CommandDesignPattern;

public class LightOnCommand implements CommandInterface {
    LightReceiver light;

    public LightOnCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchOnbuld();
    }

    @Override
    public void undo() {
        light.switchOffBulb();
    }
    
}
