import java.security.SecureRandom;
public class GuestNumber{
public static void main(String[] args){

	SecureRandom random = new SecureRandom();

	int number =  random.nextInt(1, 11);

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a number from 1 to 10: ");
	int userInput = input.nextInt();

if(userInput == number){
System.out.println("correct");

else if(userInput < number)
System.out.println("too low");
}
else if(userInput > number){
System.out.println("too high");
}

}
}