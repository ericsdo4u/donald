public class WomenPeriodicTable {

private String CheckPeriodicDate;

public void setCheckPeriodicDate(String CheckPeriodicDate){
this.CheckPeriodicDate = CheckPeriodicDate;
}

public int getCheckPeriodicDate(){
return CheckPeriodicDate;
}

 public int[] calculatingNextPeriod(String[] CheckPeriodicDate ) {

	int checkDate = Int.parseInt(CheckPeriodicDate);

	int[] processDate = new int[31];

         for(int count1 = 0; count1 <= processDate.length; count1++) {

		for(int count2 = 1; count2 <= processDate[count1].length; count2++) {

            int date = processDate[count1][count2];

if(date == processDate[count1][count2]){

date += 28;
                 

                    
		}
            }
        }
        
    }

}














        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

 System.out.print("Enter your previous period first date bleed: ");

  int userInput = input.nextInt();

     //int[] storeUserInputInArray = new int[userInput];

         int date = calculatingNextPeriod(userInput);


       System.out.println("your next period date is estimated to come: " + (date));

        
    }

   


}

