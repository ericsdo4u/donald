import java.util.Scanner;
public class TestExample{

public static int sumNum(int num1, int num2){

return num1 + num2;
}

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("enter 2 integer: ");

int userInput1 = input.nextInt();
int userInput2 = input.nextInt();

int result = sumNum(userInput1, userInput2);
System.out.printf("%d ", result);

}
}