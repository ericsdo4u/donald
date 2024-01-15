import java.util.Scanner;
 
  public class Palindrome {
 
  public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);

 System.out.print("Enter a string: ");
 String userInput = input.nextLine();

String[] checker = new String[userInput];

 int first = 0;
 int last = userInput.length() - 1;
 boolean isPalindrome = true;
 while (first < last) {
 if (userInput.charAt(first) != userInput.charAt(last)) {
 isPalindrome = false;
 break;
 }


first++;
 last--;
 }

 if (isPalindrome)
 System.out.println(userInput + " is a palindrome");
 else
 System.out.println(userInput + " is not a palindrome");
 }
 }