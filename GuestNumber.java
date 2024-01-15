import java.util.Scanner;
import java.security.SecureRandom;
public class GuestNumber{
public static void main(String[] args){

	SecureRandom random = new SecureRandom();

	int number =  random.nextInt(1, 11);

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a guest: ");
	int userInput = input.nextInt();

if(userInput == number){
System.out.printf("correct: random number is %d%n your guess is = %d", number,userInput );
}
if(userInput < number){
System.out.printf("too low: random number is %d%n your guest is = %d", number,userInput );
}
else if(userInput > number){
System.out.printf("too high: random number is %d%n your guest is = %d", number,userInput );
}

}
}