//temparature convert
import java.util.*;
public class TemparatureConvert {
    static void fahrenheitToCelcious(double fahrenheit)
    {
        double celcious;
        celcious=(fahrenheit-32)*5/9;
        System.out.println("after conversion :"+celcious);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fahrenheit;
        System.out.println("enter the temparature(in fahrenheit)  ");
        fahrenheit=sc.nextDouble();
        fahrenheitToCelcious(fahrenheit);
        sc.close();

    }
}
