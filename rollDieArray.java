import java.security.SecureRandom;

public class rollDieArray {

public static void main(String[] args){

SecureRandom randomNumbers = new SecureRandom();

int[] frequency = new int[7];

for(int rolls = 1; rolls <= 60_000_000; rolls++){
++frequency[1 + randomNumbers.nextInt(6)];

}

System.out.printf("%s%10s%n ", "face ", "Frequency ");

for(int face = 1; face < frequency.length; face++){

System.out.printf("%4d%10d%n ", face, frequency[face]);
}
}
}





