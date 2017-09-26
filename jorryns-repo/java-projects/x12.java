

public class x12
{
    public static void main()
    {
        int a,b,c;
        double x1,x2;
        a = 5; b = 3; c = 7;
        x1 = ((-b) + Math.sqrt((b*b) - (4*a*c)))/(2*a);
        x2 = ((-b) - Math.sqrt((b*b) - (4*a*c)))/(2*a);
        System.out.println(x1);
        System.out.println(x2);
    }
}
