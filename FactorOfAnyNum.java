import java.util.Scanner;

public class FactorOfAnyNum {

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);
 
   System.out.print("Enter any number and get the factor: ");
   float userInput = input.nextFloat();


	for(int number = 1; number <= userInput; number++){
	if (userInput % number ==0){
		System.out.printf(" %d ", number);

      }
    }
  }
}