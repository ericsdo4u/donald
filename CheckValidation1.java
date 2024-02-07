import java.util.Arrays;
import java.util.Scanner;

public class CheckValidation1{
public static void main(String[] args){
Scanner input = new Scanner(System.in);

CheckValidation2 validateCard = new CheckValidation2();

System.out.println("Enter credit card for validtion: ");
String creditCardNumbers  = input.nextLine();

while(creditCardNumbers.length() > 16 || creditCardNumbers.length() < 13){

System.out.println("Enter credit card for validtion Check Between 13 digit and 16 digit: ");
 creditCardNumbers  = input.nextLine();


}

validateCard.setCreditCardDigit(creditCardNumbers);
String cardNumbers = validateCard.getCreditCardDigit();

long[] cardArray = validateCard.getCreditCardArray(cardNumbers);

String cardType = validateCard.getCreditCardType(cardArray);

long checkValid = validateCard.cardDigitSort(cardArray);

String cardValidity = validateCard.creditCardValidityStatus(checkValid);


System.out.println("**************************************");

System.out.println("**Credit Card Type: "+cardType);

System.out.println("**Credit Card Number: " + cardNumbers);

System.out.println("**Credit card Digit Length: " + cardNumbers.length());

System.out.println("**Credit Card Validity Status: " + cardValidity);

System.out.println("**************************************");

}
}