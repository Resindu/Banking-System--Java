public class Student extends Thread {
    private BankAccount account;

    public Student(ThreadGroup human, String name, BankAccount account) {
        super(human, name);
        this.account = account;
    }

    @Override
    public void run() {
        System.out.println("Student transactions starts..");

        System.out.println("\nStudent going to deposit 400");
        Transaction t1 = new Transaction(getName(), 400);
        System.out.println("Student deposits 400");
        account.deposit(t1);
        System.out.println("Student deposited 400 \n");
        System.out.println(t1.toString());
        try {
            sleep( (int)(Math.random() * 100) ) ;
        } catch (InterruptedException e) {

        }

        System.out.println("\nStudent going to withdraw 500");
        Transaction t2 = new Transaction(getName(), 500);
        System.out.println("Student withdraws 500");
        account.withdrawal(t2);
        System.out.println("Student withdrew 500 \n");
        System.out.println(t2.toString());
        try {
            sleep( (int)(Math.random() * 100) ) ;
        } catch (InterruptedException e) {

        }

        System.out.println("\nStudent going to withdraw 100");
        Transaction t3 = new Transaction(getName(), 100);
        System.out.println("Student withdraws 100");
        account.withdrawal(t3);
        System.out.println("Student withdrew 100 \n");
        System.out.println(t3.toString());
        try {
            sleep( (int)(Math.random() * 100) ) ;
        } catch (InterruptedException e) {

        }

        System.out.println("\nStudent going to withdraw 700");
        Transaction t4 = new Transaction(getName(), 700);
        System.out.println("Student withdraws 700");
        account.withdrawal(t4);
        System.out.println("Student withdrew 700 \n");
        System.out.println(t4.toString());
        try {
            sleep( (int)(Math.random() * 100) ) ;
        } catch (InterruptedException e) {

        }

        System.out.println("\nStudent going to deposit 300");
        Transaction t5 = new Transaction(getName(), 300);
        System.out.println("Student deposits 300");
        account.deposit(t5);
        System.out.println("Student deposited 300 \n");
        System.out.println(t5.toString());
        try {
            sleep( (int)(Math.random() * 100) ) ;
        } catch (InterruptedException e) {

        }

        System.out.println("\nStudent going to deposit 200");
        Transaction t6 = new Transaction(getName(), 200);
        System.out.println("Student deposits 200");
        account.deposit(t6);
        System.out.println("Student deposited 200 \n");
        System.out.println(t6.toString());
        try {
            sleep( (int)(Math.random() * 100) ) ;
        } catch (InterruptedException e) {

        }

        System.out.println("\nStudent transactions terminates..");

    }
}