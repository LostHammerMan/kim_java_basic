package section3;

public class Account {

    // 잔액
    private int balance;

    // 입금
    public void deposit(int amount){
        balance += amount;
        System.out.println(amount + " 원이 입급됨");
        System.out.println("현재 잔고 : " + balance);
    }

    // 출금
    public void withdraw(int amount){
        if (balance - amount < 0){
            System.out.println("잔액부족");
        }else {
            balance -= amount;
            System.out.println(amount + " 원이 출금됨");
            System.out.println("현재 잔고 : " + balance);
        }

    }

    // 잔액 확인
    public void checkBalance(){
        System.out.println("잔고 : " + balance);
    }
}
