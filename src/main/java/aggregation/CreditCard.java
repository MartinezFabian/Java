package aggregation;

public class CreditCard {
    private String issuer;
    private String number;
    private String expirationDate;
    private String securityCode;
    private String fullName;
    private double balance;

    public CreditCard(String issuer, String number, String expirationDate, String securityCode, String fullName, double balance) {
        this.issuer = issuer;
        this.number = number;
        this.expirationDate = expirationDate;
        this.securityCode = securityCode;
        this.fullName = fullName;
        this.balance = balance;
    }

    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public String getNumber() {
        return number;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public String getFullName() {
        return fullName;
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double balance) {
        this.balance += balance;
    }
}


