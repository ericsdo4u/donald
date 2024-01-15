import java.util.Scanner;
public class HighestStudent{
public static void main(String[] args){

Scanner input1 = new Scanner(System.in);
Scanner input2 = new Scanner(System.in);

int highestScore = 0;
String newName = null;

System.out.print("Enter number of student: ");
int userInput = input1.nextInt();

for(int don = 0; don < userInput; don++){
System.out.print("Enter name of student: " );
String name = input2.nextLine();

System.out.print("Enter " + name + " score: " );
int score = input1.nextInt();


if(score > highestScore){
highestScore = score;
newName = name;
}
 }
System.out.println(newName + " score the highest " + highestScore);

}

}
