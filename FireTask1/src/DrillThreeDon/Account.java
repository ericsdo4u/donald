package DrillThreeDon;

public class Account {

   private double balance;

    public void setBalanec(double balance) {
        if(balance > 0.0) {
            this.balance = balance;
        }
    }

    public double getBalanec() {
        return balance;
    }

    public void  deposit(double depositAmt){
        if(depositAmt > 0.0){
        this.balance = balance + depositAmt;

        }

    }


}
