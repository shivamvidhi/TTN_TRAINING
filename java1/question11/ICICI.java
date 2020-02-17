package java1.question11;

class ICICI extends Bank {


    static double rate = 8.0;
    static String Name="ICICI Bank";

    public double getRate() {
        return rate;
    }

    public String getName() {
        return Name;
    }
    public void getDetails()
    {
        System.out.println(getName());
        System.out.println(getRate());
    }

}
