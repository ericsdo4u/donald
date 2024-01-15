import java.util.Scanner;

public class TwoNumberSquare{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer: ");
int number1 = input.nextInt();

System.out.print("Enter second integer: ");
int number2 = input.nextInt();

int square1 = number1 * number1;

int square2 = number2 * number2;

int sum = square1 + square2;

int difference = square1 - square2;

System.out.printf(" square1 %d , squar2 %d , sum %d , difference %d ", square1 , square2 , sum , difference);

}

}