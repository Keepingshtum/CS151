package HW1.submissions.partA.bennyngo.paypal;

public class AccountImpl implements Account {
    private String accountID;

    public AccountImpl(String accountID) {
        this.accountID = accountID;
    }

    @Override
    public String getAccountID() {
        return accountID;
    }
}
