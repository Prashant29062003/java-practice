// Access Modifiers
// 1. public: (mostly used)
// ----> anyone can access
// 2. private: (mostly used)
// ----> 

// 3. default: 
// ----> 
// 4. protected: 
// ----> package + inherited calss (child class)

// NOTE: they are used for class, variables, method, constructor

public class Demo {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.addAmount(101);
        ba.withdrawAmount(50);
        System.out.println(ba.getBalance());        
    }
}

class BankAccount {
    private double balance;

    // getters / setters
    public double getBalance () {
        // isAuthenticated, isAuthrized
        return this.balance;
    }

    // setter
    public void addAmount (double amount){
        if(amount > 0) {
            this.balance += amount;
        }
    }

    public void withdrawAmount (double amount) {
        if(amount <= balance) {
            this.balance -= amount;
        }
    }
}