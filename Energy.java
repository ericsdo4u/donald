import java.util.Scanner;

public class Energy {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the amount of water");
float m = input.nextFloat();

System.out.println("Enter initial temperature: ");

float x = input.nextFloat();

System.out.println("Enter final temperature:");

float y = input.nextFloat();

float z = y-x;

float a = m * z * 4184;

System.out.println("The energy needed is " +a);


}



}