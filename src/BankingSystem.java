public class BankingSystem {

    public static void main (String args[]) {

        System.out.println("\n.. Banking System Process ..\n");

        ThreadGroup company = new ThreadGroup("Organization");
        ThreadGroup human = new ThreadGroup("Human");
        System.out.println("# Two Thread groups created");

        
        CurrentAccount account = new CurrentAccount("Resindu", 12);
        System.out.println("# Current Account created");
        

        Student student = new Student(human, "Student", account);
        System.out.println("# Student created");
        Grandmother granny = new Grandmother(human, "Grandmother", account);
        System.out.println("# Grandmother created");

        LoanCompany lc = new LoanCompany(company, "LoanCompany", account);
        System.out.println("# Loan company created");
        University uni = new University(company, "University", account);
        System.out.println("# University created");

        student.start();
        granny.start();
        lc.start();
        uni.start();

        System.out.println("\nAll threads started.. \n");


        try {
            student.join();
            granny.join();
            lc.join();
            uni.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\n All threads terminated. \n");

        account.printStatement();

        System.out.println("Banking System process terminated successfully!");

    }

}