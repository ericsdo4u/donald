
public class CheckValidation2{

private String creditCardDigit;

public void setCreditCardDigit(String creditCardDigit) {
	this.creditCardDigit = creditCardDigit;

}

public String getCreditCardDigit() {
	return creditCardDigit;

}



public long[] getCreditCardArray(String numbers) {

long cardNumber = Long.parseLong(numbers);

long[] checkCard = new long[numbers.length()];

 for(int i = numbers.length() -1; i >= 0; i--){

checkCard[i] = cardNumber  % 10;

cardNumber /= 10;

}

return checkCard;

}


public String getCreditCardType(long[] checkCard){

String cardType ="";
if(checkCard[0] == 4){

cardType = "Visa";
}

else if(checkCard[0] == 5){
cardType = "MasterCard";
}

else if(checkCard[0] == 3 && checkCard[1] == 7){
cardType = "American Express Cards";

}

else if(checkCard[0] == 6){
cardType = "Discover cards";
}

else{
cardType = "Invalid Card";
}

return cardType;

}

public long cardDigitSort( long[] manipulateCard) {

long sum1 = 0;

for(int counter = manipulateCard.length - 2; counter >= 0; counter-=2){


if((manipulateCard[counter] * 2) > 9){

sum1 += ((manipulateCard[counter] * 2) % 10) + 1;

}


else
sum1 += (manipulateCard[counter] * 2);

}

long sum2 = 0;

for(int counter = manipulateCard.length - 1; counter >= 0; counter-=2){

sum2 += (manipulateCard[counter]);


}

long total = sum1 + sum2;
return total;
}


public String creditCarValidityStatus(long number){

 String validity = "Invalid";

if(number % 10 == 0){
validity = "Valid";
}

return validity;
}

}
