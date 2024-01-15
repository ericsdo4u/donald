import java.util.Scanner;

 public class ReadingArray2{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter numbers in arrayS: ");
int  num = input.nextInt();

double[] myList = new double[num];


double total = 0;

System.out.println("Enter numbers: ");
for (int i = 0; i < myList.length; i++) {
myList[i] = input.nextDouble();

 total += myList[i];
}

double average = total / num;
int count = 0;
for(int i = 0; i < num; i++)
if(myList[i] > average)
count++;

System.out.println("total is " + total );
System.out.println("Average is " + average );
System.out.print("Number above average is " + count); 
}
}