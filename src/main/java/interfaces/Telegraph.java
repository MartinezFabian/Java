package interfaces;

public class Telegraph extends Relic implements ICommunicator {
    private boolean isWorking;

    public Telegraph(String description, boolean isWorking) {
        super(description);
        this.isWorking = isWorking;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean isWorking) {
        this.isWorking = isWorking;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Mensaje desde Telégrafo: " + message);
    }
}
