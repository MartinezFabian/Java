package interfaces;

public class HomingPigeon extends Pigeon implements ICommunicator {
    private double speed;

    public HomingPigeon(String name, String color, double speed) {
        super(name, color);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Mensaje desde la Paloma " + getName() + " de color " + getColor() + " y velocidad de " + getSpeed() + " km/h: " + message);
    }
}
