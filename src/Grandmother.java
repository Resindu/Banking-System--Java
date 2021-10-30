public class Grandmother extends Thread {
    private BankAccount bankaccount;

    public Grandmother(ThreadGroup human, String name, BankAccount bankaccount) {
        super(human, name);
        this.bankaccount = bankaccount;
    }

   
    @Override
    public void run() {

        System.out.println("Grandmothers's top-up gifts transactions starts..");

        try {
            sleep( (int)(Math.random() * 3000) ) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("\n Grandmother going to deposit 900");
        Transaction t1 = new Transaction(getName(), 900);
        System.out.println("Grandmother deposits 900");
        bankaccount.deposit(t1);
        System.out.println("Grandmother  deposited 900 \n");
        System.out.println(t1.toString());


        try {
            sleep( (int)(Math.random() * 1000) ) ;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Grandmother  going to deposit 1000");
        Transaction t2 = new Transaction(getName(), 1000);
        System.out.println("Grandmother deposits 1000");
        bankaccount.deposit(t2);
        System.out.println("Grandmother   deposited 1000 \n");
        System.out.println(t2.toString());

        System.out.println("\nGrandmother transactions terminates..");
    }

}