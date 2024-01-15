import java.util.Scanner;

public class ArithmeticSmaLar{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int number1 = input.nextInt();

System.out.print("Enter second integer: ");
int number2 = input.nextInt();

System.out.print("Enter third integer: ");
int number3 = input.nextInt();

int sum = number1 + number2 + number3;

int average = (number1 + number2 + number3) / 2; 

int product = number1 * number2 * number3;

System.out.printf(" %d is sum , %d is average, %d is product  " ,  sum , average , product );

if(number1 > number2 && number1 > number3 )
System.out.printf("%d is the largest ", number1 );


if(number1 < number2 && number1 < number3 )
System.out.printf("%d is the smallest ", number1);


if(number2 > number1 && number2 > number3 )
System.out.printf("%d is the largest ", number2);


if(number2 < number1 && number2 < number3 )
System.out.printf("%d is the smallest ", number2);


if(number3 > number1 && number3 > number2 )
System.out.printf("%d is the smallest ", number3);

if(number3 < number1 && number3 < number2 )
System.out.printf("%d is the smallest ", number3);






}

}