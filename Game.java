import java.util.Scanner;
public class Game{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.println("Enter player1 name: ");
String Player1 = input.nextLine();
System.out.println("Enter player2 name: ");
String Player2 = input.nextLine();
System.out.printf("%sEnter a number 0, 1 0r 2: ", Player1 );
int Number1 = input.nextInt();
System.out.printf("%sEnter a number 0, 1 or 2: ", Player2 );
int Number2 = input.nextInt();
if(Number1 == 1 && Number2 == 0)
System.out.printf("%s won %s", Player1, Player2); 
if(Number1 == 1 && Number2 == 1)
System.out.printf("%s draw %s", Player1, Player2);
if(Number1 == 1 && Number2 == 2)
System.out.printf("%s won %s", Player2, Player1);
if(Number1 == 0 && Number2 == 1)
System.out.printf("%s won %s", Player2, Player1);
if(Number1 == 0 && Number2 == 2)
System.out.printf("%s won %s", Player2, Player1);
if(Number1 == 0 && Number2 == 0)
System.out.printf("%s draw %s", Player1, Player2);
if(Number1 == 2 && Number2 == 0)
System.out.printf("%s won %s", Player1, Player2);
if(Number1 == 2 && Number2 == 2)
System.out.printf("%s draw %s", Player1, Player2);
if(Number1 == 2 && Number2 == 1)
System.out.printf("%s won %s", Player1, Player2);

}

}
