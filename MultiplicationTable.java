import java.util.Scanner;

public class MultiplicationTable{

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);


System.out.println("Enter a number to display its multiplication number: ");
int userInput = input.nextInt();

int counter = 1;

int result = 0;

if( userInput <= 0 || userInput >= 24){
System.out.println(" Invalid number Input, please enter 1 to 24 ");

}

while(counter <= 24){

result = userInput * counter;

System.out.printf("%n %d x %d = %d" ,userInput, counter, result); 

counter++;

}

}

}
