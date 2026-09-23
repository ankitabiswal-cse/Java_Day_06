class BankBalance{
    String name;
    double balance;

    void display(){
        System.out.println("Account Holder ="+name);
        System.out.println("BankBalance ="+balance);
    }
}
public class BankBalanceDemo {
    public static void main(String[] args){
        BankBalance b1 = new BankBalance();
        b1.name = "Ankita Biswal";
        b1.balance = 25000;
        b1.display();
    }
}
