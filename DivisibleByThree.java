import java.util.Scanner;

public class DivisibleByThree{

public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter integer numbers: ");

float userInput = input.nextFloat();

if(userInput % 3 == 0){

System.out.printf("%.0f is divisible by 3", userInput);
}

if(userInput % 3 != 0){

System.out.printf("%.0f is not divisible by 3", userInput);
}


}

}


