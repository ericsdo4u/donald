import java.util.Scanner;
public class Celsius1{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter degree celsius: ");
double Celsius = input.nextDouble();

double Fahrenheit = (9.0/5) * Celsius + 32;

System.out.printf("%.1f Celsius is: %.1f Fahrenheit", Celsius , Fahrenheit);

}


}