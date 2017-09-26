
public class basic
{
    public static void main(double basic)
    {
        double da,hra,Provident,netpay,grosspay;
        da = (20/100)*basic;
        hra = (10/100)*basic;
        Provident = (8.23/100)*basic;
        netpay = basic+da+hra;
        grosspay = netpay - Provident;
        System.out.print("Gross pay is " + grosspay);
    }
}
