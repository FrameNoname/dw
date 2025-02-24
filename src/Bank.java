// Java Implementation of a Simple Banking System

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void createAccount(Customer customer, Account account) {
        customer.openAccount(account);
    }
}

class Customer {
    private String name;
    private String customerId;

    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    public void openAccount(Account account) {
        System.out.println(name + " has opened an account with number: " + account.getAccountNumber());
    }
}

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Remaining Balance: " + balance);
        }
    }
}

class Transaction {
    private String transactionId;
    private double amount;

    public Transaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void processTransaction() {
        System.out.println("Processing transaction ID: " + transactionId + " for amount: " + amount);
    }
}
