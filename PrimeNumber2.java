import java.util.Scanner;

public class PrimeNumber {

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);

   System.out.println(" Enter number to check if its prime : ");
   int userInput = input.nextInt();

   int check = 0;

   int prime = 0;

   check = userInput / 2;

   if(userInput == 0 || userInput == 1){

    System.out.println(" this number Not a prime number ");

    }else{

         for(int count = 2; count <= check; count++){

	if(userInput % count == 0){

       System.out.println(" this number Not a prime number ");

	prime = 1;

	break;

	}

     }

	if(prime == 0){

	System.out.println(" This number is a prime number ");

	  }

      }

   }
}


