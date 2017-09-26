
public class Student_Info
{
    public static void Result(int e,int m,int p,int c,int b,int cap)
    {
        int total;
        double percentage;
        total = e+m+p+c+b+cap;
        percentage = total*100/600;
        System.out.println("Marks in English is " + e);
        System.out.println("Marks in Maths is " + m);
        System.out.println("Marks in Physics is " + p);
        System.out.println("Marks in Chemistry is " + c);
        System.out.println("Marks in Biology is " + b);
        System.out.println("Marks in Computer Application is " + cap);
        System.out.println("The total is " + total);
        System.out.println("The percentage is " + percentage + "%");
    }

  
}
