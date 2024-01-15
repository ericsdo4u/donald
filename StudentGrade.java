import java.util.Scanner;
public class StudentGrade{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

int total = 0;
int counter = 0;

System.out.print("Enter garde and -1 to quit: ");
int grade = input.nextInt();
while(grade != -1){
total = total + grade;
counter++;
System.out.print("Enter garde and -1 to quit: ");
grade = input.nextInt();

}

if(counter != 0){
double average = (double) total / counter;

System.out.printf("%n the counter %d and the total is %d", counter, total);

System.out.printf("%n Average is %.2f", average);
}
else{
System.out.println(" No grade was enter");
}

}
}