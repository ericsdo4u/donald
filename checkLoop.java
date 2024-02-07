import java.util.Scanner;

public class checkLoop{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter three numbers seperated with space ");
double num1 = input.nextDouble();
double num2 = input.nextDouble();
double num3 = input.nextDouble();

double result = maximumNum(num1, num2, num3);

System.out.print("the maximum is  " + result );

}

public static double maximumNum(double max1, double max2, double max3){

double calMax = max1;

if( max2 > calMax){
calMax = max2;
}

if( max3 > calMax){
calMax = max3;
}

return calMax;

}

}