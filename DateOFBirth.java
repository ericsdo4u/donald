import java.util.Scanner;

public class DateOfBirth{

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);

  System.out.println("Enter year of birth: ");

   int year = input.nextInt();

   int thisYear = 2024;

   int age = thisYear - year;

System.out.printf("you are %d years old. ", age);

}

}