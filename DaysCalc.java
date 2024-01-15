import java.util.Scanner;

public class DaysCalc {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print(" Enter Age in year: ");
long userInput = input.nextLong();

long days = userInput * 365L;

if(days < 0){
System.out.print("Please only the positive integers is allow:");
}


System.out.printf("the age in days is %d", days);




}

}