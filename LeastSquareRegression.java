import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class LeastSquareRegression {
	double[] p = new double[]{95,85,80,70,60};
    double[] q = new double[]{85,95,70,65,70};
    double meanX = mean(p);
    double meanY = mean(q);
    double sdX = standardDeviation(p, meanX);
    double sdY = standardDeviation(q, meanY);
    double b = pearsonCoefficient(p,q,5)*(sdY/sdX); 
    double a = meanY-b*meanX;
    double x = 80;
    System.out.printf("%.3f" + (a+b*x));


public static double pearsonCoefficient(double[] a, double[] b, int num){
    double meanX = mean(a);
    double sdx = standardDeviation(a, meanX);
    double meanY = mean(b);
    double sdy = standardDeviation(b, meanY);
    double numerator = 0;
    for(int i=0;i<num;i++){
        numerator += (a[i]-meanX)*(b[i]-meanY);
    }
    double pearsonCoefficient = (double)numerator /(num*sdx*sdy);
    return pearsonCoefficient;
}
public static double mean(double[] a) {
    double sum = 0;
    for (int i = 0; i < a.length; i++) {
        sum = sum + a[i];
    }
    double mean = (double)sum / a.length;
    return mean;
}
public static double standardDeviation(double[] a, double mean) {
    double sumOfSquaredDifferences = 0;
    for (int i = 0; i < a.length; i++) {
        sumOfSquaredDifferences = sumOfSquaredDifferences + Math.pow(mean - a[i], 2);
    }
    double variance = (double)sumOfSquaredDifferences / a.length;
    double standardDeviation = (double)Math.sqrt(variance);
    return standardDeviation;
}
}
