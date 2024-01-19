import java.util.Scanner;

public class FactorialNumber{

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);


	System.out.println("Enter a number: ");
	int userInput = input.nextInt();

	int factorial = 1;

	if(userInput >= 1 && userInput <= 20){
	
	for(int count = 2; count <= userInput ; count++){
	factorial *=  count;

	}

	System.out.printf("%d  factorial  = %d", userInput, factorial);

	  }
	
	}

}
