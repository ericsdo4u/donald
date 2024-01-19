import java.util.Scanner;

import java.util.ArrayList;

public class CheckOutApp {

private static ArrayList<String> itemType = new ArrayList<String>();

private static ArrayList<Integer> quantityPurchase = new ArrayList<integer>();

private static ArrayList<Double> pricePerQuantity = new ArrayList<Double>();

private static String customerName = " ";

private static String cashierName =" ";

private static String addMoreItem =" ";

private static float discount = 0;



public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("what is the customer's name ");
customerName = input.nextLine();


String addMoreItem = " ";


do {


System.out.println("What did the user buy? ");
itemType = input.nextLine();

System.out.println("How many pieces? ");
quantityPurchase = input.nextInt();

System.out.println("How much per item? ");
 pricePerQuantity = input.nextInt();

System.out.println("Add more items? ");
	input.nextLine();
  addMoreItem = input.nextLine();
}
while (addMoreItem.equalsIgnoreCase("yes"));


System.out.println("What is the casher's name? ");
cashierName = input.nextLine();

System.out.println("How much discount will the customer get? ");
discount = input.nextInt();


}
}


