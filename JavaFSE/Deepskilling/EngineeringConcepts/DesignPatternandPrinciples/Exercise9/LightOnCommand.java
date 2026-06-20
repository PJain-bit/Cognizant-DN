package Deepskilling.EngineeringConcepts.DesignPatternandPrinciples.Exercise9;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
