package CommandDesignPattern;

public class main {
    public static void main(String[] args) {
        LightReceiver light = new LightReceiver("Off");

        CommandInterface lighOnCommand = new LightOnCommand(light);

        RemoteControlInvoker remoteControl = new RemoteControlInvoker(lighOnCommand);
        remoteControl.buttonPressed();
    }
}
