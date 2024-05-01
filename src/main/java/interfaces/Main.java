package interfaces;

public class Main {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone("Samsung", "S22", "Android");
        HomingPigeon homingPigeon = new HomingPigeon("Pepita", "blanca", 20);
        Telegraph telegraph = new Telegraph("Telégrafo", true);

        ICommunicator[] communicators = {cellPhone, homingPigeon, telegraph};

        for (ICommunicator communicator : communicators) {
            communicator.sendMessage("Mensaje de prueba"); // POLIMORFISMO
        }
    }
}
