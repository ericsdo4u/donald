public class MultiplicationTable2{

 public static void main(String[] args){


		int length = 12;

			for(int counter1 = 1; counter1 <= length ; counter1++){

					for(int counter2 = 1; counter2 <= length; counter2++){

						System.out.print(counter2  +  " x "    +  counter1   +  "="  +   (counter2 * counter1)+ "  ");
				}

			System.out.println();

		}
	}	

}

