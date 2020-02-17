package java1.question11;

class BOI extends Bank {
    static double rate = 8.5;
    static String Name = "BOI Bank";

    public  double getRate() {
        return rate;
    }

    public  String getName() {
        return Name;
    }

    public  void getDetails()
    {
        System.out.println(getName());
        System.out.println(getRate());
    }

}
