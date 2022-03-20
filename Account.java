/*  CMS250
 *  Assignment1
 *  Mingrui Yuan
 *  Nicole Ponce
 */

public class Account {

    // Data members
    private int accNum;
    private float accBalance;

    // Account Constructor
    public Account(int accNum, float accBalance) {
        this.accNum = accNum;
        this.accBalance = accBalance;
    }

    // Getters and setters
    public int getAccNum() {
        return accNum;
    }

    public float getAccBalance() {
        return accBalance;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setAccBalance(float accBalance) {
        this.accBalance = accBalance;
    }

    // The deposit method takes a float and updates the balance
    public void deposit(float depositAcc) {
        float newBalance = this.getAccBalance() + depositAcc;
        this.setAccBalance(newBalance);
    }

    // The withdraw method takes a float to calculate the balance after transactions
    public void withdraw(float withdrawAcc) {
        if(withdrawAcc <= accBalance){
            float newBalance = (float)(this.getAccBalance() - withdrawAcc);
            this.setAccBalance(newBalance);
        } else if(withdrawAcc > accBalance) {
            System.out.println("Insufficient funds for withdrawal on account number <" + accNum + ">");
        }
    }

    // The print method to print the needed information
    public void print() {
        System.out.println("Account#: " + accNum);
        System.out.println("Account Balance: " + accBalance);
        System.out.println("\n--------------------------------\n");
    }
}
