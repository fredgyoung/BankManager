

public class Main {

    public static void main(String[] args) {

        SavingsAccount sa = new SavingsAccount();
        sa.account = 1001;
        sa.balance = 1000.00;

        CheckingAccount ca = new CheckingAccount();
        ca.account = 1001;
        ca.balance = 1000.00;

        CertificateOfDeposit cod = new CertificateOfDeposit();
        cod.account = 1001;
        cod.balance = 1000.00;

        System.out.println(sa.account);
        System.out.println(sa.balance);

        System.out.println(ca.account);
        System.out.println(ca.balance);

        System.out.println(cod.account);
        System.out.println(cod.balance);
    }
}
