import java.util.Scanner;

public class products {

  public static void main(String[] args){

   Scanner input = new Scanner(System.in);

     System.out.println(" Enter 2 numbers : ");

      int num1 = input.nextInt();
      int num2 = input.nextInt();

int productOfNumbers = productOfTwoNumbers(num1, num2);

System.out.println("The sum of " + num1 + " and " + num2 +  " = " +productOfNumbers);

}

public static int productOfTwoNumbers(int firstNumber, int secondNumber){

	int sum = 0;	

        for(int count = 1; count <= firstNumber; count++){

         sum += secondNumber; 

      }

        return sum;

   }

}
