public class Main {
    public static void main(String[] args) {
        BankAccount akunBank = new BankAccount();
        System.out.println("Saldo sebelum transaksi: " + akunBank.getBalance());
        System.out.println("Deposit sejumlah " + akunBank.deposit(5000) + " \nBerhasil. Saldo saat ini " + akunBank.getBalance());
        System.out.println("Penarikan sejumlah " + akunBank.withdraw(2000) + " \nBerhasil. Saldo saat ini " + akunBank.getBalance());
        System.err.println("Saldo setelah transaksi: " + akunBank.getBalance());
    }
}