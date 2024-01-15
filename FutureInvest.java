import java.util.Scanner;

public class FutureInvest {

public static void main(String[] args) {

Scanner Input = new Scanner(System.in);

System.out.println("enter investment amount:");
Float investmentAmount = Input.nextFloat();

System.out.println("enter number of years:");
Float numberOfYears = Input.nextFloat();

System.out.println("monthly interest rate");
Float monthlyInterestRate = Input.nextFloat(0);
System.out.println("enter annual interest rate:");
Float annualInterestRate = Input.nextFloat();

Float b = investmentAmount * 1;

Float a = investmentAmount * monthlyInterestRate;

Float n = numberOfYears * 12;

Float m = annualInterestRate / 12;

Float f = investmentAmount + numberOfYears;

float sum = b + a + n + m + f;

System.out.println("future investment value: " + sum);



}

}