public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Simple Bank");
        Customer customer = new Customer("John Doe", "C001");
        Account account = new Account("A1001", 500.0);
        bank.createAccount(customer, account);
        
        account.deposit(200.0);
        account.withdraw(100.0);

        Transaction transaction = new Transaction("T12345", 150.0);
        transaction.processTransaction();
    }
}