import java.util.Scanner;

public class Product{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number");

int x = input.nextInt();

System.out.print("Enter second number");
 
int y = input.nextInt();

System.out.print("Enter third number");

int z = input.nextInt();

int result = x * y * z;

System.out.printf("product is %d%n", result);


}

}