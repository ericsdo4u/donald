import java.util.Scanner;

public class TrippleD{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer");
double trippl = input.nextDouble();

System.out.print("Enter second integer:" );
double doubl = input.nextDouble();

double trippl1 = trippl + trippl + trippl;

double doubl2 = doubl + doubl;

if(trippl1 % doubl2 == 0)
System.out.printf("%.1f is a multiple %.1f" , trippl1 , doubl2);

if(trippl1 % doubl2 != 0)
System.out.printf("%.1f is not multiple %.1f" , trippl1 , doubl2);




}


}