package DSA;
import java.util.Scanner;

public class Forecasting {
    public static double forecast(double currentvalue,double growthrate,int years)
    {
        if(years==0)//if there is no year then currentvalue
        {
            return currentvalue;
        }
        double futurevalue=forecast(currentvalue,growthrate,years-1);//recursive call bcos same parameter ,years-1->tocheck each year 5 to 0
        return futurevalue*(1+growthrate);//10000 *(1+0.10)=11000.00
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double currentvalue=sc.nextDouble();
        double growthrate=sc.nextDouble();
        int years=sc.nextInt();
        double futurevalue=forecast(currentvalue,growthrate,years);
        System.out.println("Future value after "+years+" years is: "+futurevalue);
    }
}
