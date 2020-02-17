package java1.question11;

class SBI extends Bank {
    static  double rate = 8.8;
    static String Name = "SBI Bank";

    public double getRate() {
        return rate;
    }

    public  String getName() {
        return Name;
    }
    public void getDetails()
    {
        System.out.println(getName());
        System.out.println(getRate());
    }
}
