import java.util.Scanner;

public class MultiplicationTable{

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);


System.out.println("Enter a number to display its multiplication number: ");
int userInput = input.nextInt();

int counter = 1;

int result = 0;

while(counter <= 24){

result = userInput * counter;

if( userInput <= 1 || userInput >= 24){
System.out.println(" Invalid number Input, please enter 1 to 24 ");

break;
}

System.out.printf("%n %d x %d = %d" ,userInput, counter, result); 

counter++;

}

}

}
