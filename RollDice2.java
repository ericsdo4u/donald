import java.security.SecureRandom;

public class RollDice2 {

 public static void main(String[] args){

  SecureRandom randomNumber = new SecureRandom();

  int face = randomNumber.nextInt();

int tolls1 = 0;
int tolls2 = 0;
int tolls3 = 0;
int tolls4 = 0;
int tolls5 = 0;
int tolls6 = 0;

   for(int roll = 1; roll <= 60_000_000; roll++){

   face = 1 + randomNumber.nextInt(6);

      switch(face){

	case 1: ++tolls1; break;
	case 2: ++tolls2; break;
	case 3: ++tolls3; break;
	case 4: ++tolls4; break;
	case 5: ++tolls5; break;
	case 6: ++tolls6; break;

	}
	}
     System.out.println("Face\tTolls ");

	System.out.printf("\t%d%n\t%d%n\t%d%n\t%d%n\t%d%n\t%d%n", tolls1, tolls2, tolls3, tolls4, tolls5, tolls6);
      
    
   }
} 
