public class CurrentAccount implements BankAccount {

    private int currentBalance;
    private int accountNumber;
    private String accountHolder;
    private Statement statement;

    public CurrentAccount (String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.statement = new Statement(accountHolder, accountNumber);
    }

    @Override
    public int getBalance() {
        return currentBalance;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String getAccountHolder() {
        return accountHolder;
    }

    @Override
    public synchronized void deposit(Transaction t) {
        
    	 if (t.getAmount() > 0) {
        currentBalance =currentBalance+ t.getAmount();
        statement.addTransaction(t.getCID(), t.getAmount(), currentBalance);
        notifyAll();
    	 } else {
	            System.out.println(t.getCID() + " " + "doesn't have enough money for deposit");
	        }
    }

    @Override
    public synchronized void withdrawal(Transaction t) {
        if(currentBalance>=t.getAmount()) {
            currentBalance= currentBalance - t.getAmount();
            statement.addTransaction(t.getCID(), t.getAmount(), currentBalance);

            

        
            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public boolean isOverdrawn() {
        if(currentBalance < 0){
            return true;
        }
        return false;
    }

    @Override
    public void printStatement() {
        //System.out.println("\n Statement: Account Holder - "+accountHolder+ "\t \t Account Number - "+ accountNumber+" \t\t Balance - " + balance);
        statement.print();
    }
}