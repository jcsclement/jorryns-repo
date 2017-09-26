
public class oddeven
{
   public static void main(int n)
    {
        boolean x;
        x = (n%2)==0 ? true:false;
        
        if (x==true){
            System.out.print("even");
        }
        if (x==false){ 
            System.out.print("odd");
        }
    }
}
