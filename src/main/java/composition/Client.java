package composition;

import aggregation.CreditCard;

public class Client {
    private String fullName;
    private String dni;
    private CreditCard creditCard;

    public Client(String fullName, String dni, String issuer, String number, String expirationDate, String securityCode, String fullNameCreditCard) {
        this.fullName = fullName;
        this.dni = dni;
        this.creditCard = new CreditCard(issuer, number, expirationDate, securityCode, fullNameCreditCard, 0);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

}
