import java.util.Scanner;
public class CurrencyConversion {
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.print("Conversion rate:");
double conversion = input.nextDouble();

System.out.print("Enter 0 to convert to dollar or 1 to convert to yuan:");
double currency = input.nextDouble();

if(currency == 0){
System.out.print("Enter the dollar amount:");
double dollar = input.nextDouble();
double newYuan = dollar * conversion; 
System.out.printf("$%.1f is %.1f yuan", dollar, newYuan);}

if(currency == 1){
System.out.print("Enter the yuan amount:");
double yuanAmount = input.nextDouble();
double dollarAmount = yuanAmount / conversion; 
System.out.printf("$%.1f is %.1f yuan ", yuanAmount, dollarAmount);
}


}
}




