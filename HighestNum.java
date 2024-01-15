import java.util.Scanner;

public class HighestNum{

	public static void main(String[] args){

          Scanner input = new Scanner (System.in);
	 Scanner input1 = new Scanner (System.in);

 int highestScore = 0;
String newName = null;


System.out.print("Number of student: ");
int userInput = input.nextInt();

for(int num = 0; num < userInput; num++){

System.out.print("Enter name of student: ");
 String name = input1.nextLine();

System.out.print("Enter " + name + " Score: ");
int score = input.nextInt();

if(score > highestScore){
 highestScore = score;
 newName = name;
}
   }

System.out.println(newName  + " have The Highest Score " + highestScore);

}

}






	
             