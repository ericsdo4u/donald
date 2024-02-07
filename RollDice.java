import java.security.SecureRandom;

public class RollDice {

 public static void main(String[] args){

  SecureRandom randomNumber = new SecureRandom();

   int face = randomNumber.nextInt();

   for(int roll = 1; roll <= 20; roll++){

    face = 1 + randomNumber.nextInt(6);

     System.out.printf("%d  ", face);

      if(roll % 5 == 0){
        System.out.println();
      }
    }
   }
} 

    