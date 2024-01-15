import java.util.Scanner;

public class Sum{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter number1: ");

int number1 = input.nextInt();

System.out.print("Enter  number2: ");

int number2 = input.nextInt();

int sum = number1 + number2;

System.out.printf("%d", sum);
}

}