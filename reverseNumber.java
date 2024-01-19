import java.util.Scanner;

public class reverseNumber{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println(" Enter 5 digit number to be reversed : ");
long userInput = input.nextLong();

long numberToBeReverse = 0;

while( userInput != 0){

long remainder = userInput % 10;

numberToBeReverse = numberToBeReverse * 10 + remainder;

userInput /= 10;

}

System.out.printf(" %d ", numberToBeReverse );

}
}



