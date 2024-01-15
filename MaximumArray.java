import java.util.Scanner;

 public class MaximumArray{

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter array length: ");
int array = input.nextInt();

double[] myList = new double[array];

double max = myList[0];

System.out.println("Enter elements :");

for (int i = 0; i < myList.length; i++){ 
myList[i] = input.nextDouble();

 if (myList[i] > max){
 max = myList[1];

}
}
System.out.print("Max element is " +max  );

}
}