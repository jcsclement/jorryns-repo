

public class shopkeepeersdetails
{
   public static void main(String name,long licenseno,long monthlyincome)
    {
        long annualincome;
        double tax,salestax;
        annualincome = monthlyincome*12;
        tax = 20*annualincome/100;
        salestax = 15*annualincome/100;
        System.out.println("Shopkeeper's name is " + name);
        System.out.println("License number is " + licenseno);
        System.out.println("Total monthly income is " + monthlyincome);
        System.out.println("Total annual income is " + annualincome);
        System.out.println("Tax amount is " + tax);
        System.out.println("Sales tax amount is " + salestax);
    }
}