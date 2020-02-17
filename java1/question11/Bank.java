package java1.question11;

class Bank
{
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.getDetails();
    }
    public void getDetails()
    {
        BOI boi = new BOI();
        boi.getDetails();
        ICICI icici= new ICICI();
        icici.getDetails();
        SBI sbi = new SBI();
        sbi.getDetails();
    }
}
