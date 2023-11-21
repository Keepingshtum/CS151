package paypal;

public class Account {
    private String accountID;

    public Account(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountID() {
        return accountID;
    }
}