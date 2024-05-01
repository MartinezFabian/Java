package interfaces;

public class CellPhone extends Phone implements ICommunicator {
    private String operatingSystem;

    public CellPhone(String brand, String model, String operatingSystem) {
        super(brand, model);
        this.operatingSystem = operatingSystem;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Mensaje desde celular de la marca " + getBrand() + ", modelo " + getModel() + " con sistema operativo " + getOperatingSystem() + ": " + message);
    }
}
