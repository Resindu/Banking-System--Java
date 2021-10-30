public class LoanCompany extends Thread {
    private BankAccount bankaccount;

    public LoanCompany(ThreadGroup organizationThreadGroup, String name, BankAccount account) {
        super(organizationThreadGroup, name);
        this.bankaccount = account;
    }

    

    @Override
    public void run() {
        System.out.println("Loan Company  transactions starts..");

        try {
            sleep( (int)(Math.random() * 2000) ) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\nLoan Company  going to deposit 50");
        Transaction deposit1 = new Transaction(getName(), 50);
        System.out.println("Loan Company  deposits 50");
        bankaccount.deposit(deposit1);
        System.out.println("Loan Company   deposited 50 \n");
        System.out.println(deposit1.toString());


        try {
            sleep( (int)(Math.random() * 1000) ) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nLoan Company  going to deposit 350");
        Transaction deposit2 = new Transaction(getName(), 350);
        System.out.println("Loan Company   deposits 350");
        bankaccount.deposit(deposit2);
        System.out.println("Loan Company  deposited 350 \n");
        System.out.println(deposit2.toString());

        try {
            sleep( (int)(Math.random() * 1000) ) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("\nLoan Company  going to deposit 2000");
        Transaction deposit3 = new Transaction(getName(), 2000);
        System.out.println("Loan Company deposits 2000");
        bankaccount.deposit(deposit3);
        System.out.println("Loan Company  deposited 2000 \n");
        System.out.println(deposit3.toString());

        System.out.println("\nLoan Company  transactions terminates..");
    }
}