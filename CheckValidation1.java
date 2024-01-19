public class CheckValidation2{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter credit card for validtion: ");
String digit = input.nextLine();

long cardNumber = Long.parseLong(digit);

long[] checkCard = new long[digit.length()];

 for( int i = digit.length() -1; i >= 0; i--){

checkCard[i] = cardNumber  % 10;

cardNumber /= 10;

}

System.out.println(getCreditCardType(checkCard));


}
