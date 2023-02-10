public class Account {

    private int id;
    private Custumer custumer;
    private double balance;

    public Account(int id, Custumer custumer, double balance) {
        super();
        this.id = id;
        this.custumer = custumer;
        this.balance = balance;
    }

    public Account(int id, Custumer custumer) {
        super();
        this.balance = 0.0;
    }

    public int getId() {
        return this.id;
    }

    public Custumer getCustumer() {
        return this.custumer;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        //this.custumer.toString() + "balance=$ " + this.balance;
        DecimalFormat df = new DecimalFormat("0.00");
        return this.custumer.toString() + "balance=$" + df.format(this.balance);
    }

    public String getCustumerName() {
        return this.custumer.getName();
    }

    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("\"amount withdrawn\n"
                    + "exceeds the curent balance!\"");
        }

        return this;
    }

    
}
