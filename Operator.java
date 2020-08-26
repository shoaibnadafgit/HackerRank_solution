import java.util.Scanner;
import java.math.*;
import javax.annotation.processing.RoundEnvironment;

public class Operator {


    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tax=meal_cost*((double)tax_percent/100);
        double tip=meal_cost*((double)tip_percent/100);
     //   System.out.println(meal_cost+" "+tax+ " "+tip);
        double totalmeal=tax+tip+meal_cost;
        
    System.out.println(Math.round(totalmeal));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
System.out.println(tip_percent+" "+tax_percent);
        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
