package Worked_Example;

public class ThreadExercies extends Thread implements Runnable {

private static final System Logger = null;
private Person person;

public ThreadExercies(Person p) {
    this.person = p;
}

public static void main(String[] args) {

    ThreadExercies ts1 = new ThreadExercies(new Person("person 1"));
    ts1.start();
    ThreadExercies ts2 = new ThreadExercies(new Person("person 2"));
    ts2.start();
    ThreadExercies ts3 = new ThreadExercies(new Person("person 3"));
    ts3.start();

}

@Override
public void run() {
    for (int i = 0; i < 3; i++) {
        try {
            Account acc = Account.getAccount(person);
            acc.withdraw(100);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
               // Logger.getLogger(ThreadExercies.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (acc.getBal() < 0) {
                System.out.println("account is overdrawn!");
            }
            acc.deposit(200);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    System.out.println("Final Acc balance is Rs." + Account.getBal());
}}