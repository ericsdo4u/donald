import java.util.Scanner;
public class RadiusOfCircle{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter radius of a circle: ");
double radius = input.nextDouble();

Double diameter = radius * 2;
Double circumference = radius * 2 * 3.14159;
Double area = radius * radius * 3.14159; {

System.out.printf("diameter is %.1f, circumference is %.1f, area is %.1f", diameter, circumference, area );
}


}

}