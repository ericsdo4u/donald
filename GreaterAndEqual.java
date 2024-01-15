import java.util.Scanner;

public class GreaterAndEqual{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter integer: ");
int userInput = input.nextInt();

int square = userInput * userInput;

int number = square + userInput;

if(number > 100 )
System.out.printf("%d is greater than 100" , number);

if(number == 100 )
System.out.printf("%d is equal to 100" , number);

if(number != 100)
System.out.printf("%d is  not equal to 100" , number);

if(number < 100)
System.out.printf("%d is less equal 100" , number);



}

}














