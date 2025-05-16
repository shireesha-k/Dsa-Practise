package java_internal;
 abstract class BankAccount{
    abstract void deposit();
    abstract void withDraw();
 }
 class SavingAccount extends BankAccount{
    void deposit(){
        System.out.println("Deposit in svaving account");
    }
    void withDraw(){
        System.out.println("Withdraw in saving account");
    }
 }
 class CurrentAccount extends BankAccount{
    void deposit(){
        System.out.println("Deposit in current account");
    }
    void withDraw(){
        System.out.println("Withdraw in current account");
    }
 }
public class fourteen {
    public static void main(String[] args) {
        SavingAccount s=new SavingAccount();
        s.deposit();
        s.withDraw();

        CurrentAccount c=new CurrentAccount();
        c.deposit();
        c.withDraw();
    }
}
