import java.util.Scanner;
public class NokiaPhone{
 public static void main(String[] args){
  Scanner input = new Scanner(System.in);

 System.out.printf("%s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n %s%n", "Phone menu", "1.phone book", "2.message", "3.Chat", "4.Call",  "5.Tone", "6.Settings", "7.Call Divert", "8.Game",  "9.Calculator",  "10.Reminders", "11.Clock", "12.Profile", "13.Sim sevice" );

   	System.out.print("Enter 1 to navigate phone book: ");
     	int phoneBook = input.nextInt();
 	if(phoneBook == 1){
		 System.out.println("1.phone book \n 1.search \n 2.Service nos \n 3.Add name \n 4.Erase \n 5.Edit \n 6.Assign tone \n 7.Send \n 8.option \n  1.Type of view \n  2.Memory status \n 9.Speed \n 10.Voice Tag");

	System.out.print("Enter 1 for search: ");
	int search = input.nextInt();
	if(search == 1 ){
	System.out.println(" \n  Search\n  ");
	 }
	System.out.print("Enter 2 for service: ");
	int service = input.nextInt();
	if(service == 2){
	System.out.println(" \n  Service nos\n  ");
	 }
	System.out.print("Enter 3 for add name: ");
	int addName = input.nextInt();
	if(addName == 3){
	System.out.println(" \n  Add name\n  ");
	 }
	System.out.print("Enter 4 for Erase: ");
	int erase = input.nextInt();
	if(erase == 4){
	System.out.println(" \n  Erase\n  ");
	 }
	System.out.print("Enter 5 for edit: ");
	int edit = input.nextInt();
	if(edit == 5){
	System.out.println(" \n  Edit\n  ");
	 }
	System.out.print("Enter 6 for assign tone: ");
	int assignTone = input.nextInt();
	if(assignTone == 6){
	System.out.println(" \n  Assign tone \n ");
	 }
	System.out.print("Enter 7 send: ");
	int send = input.nextInt();
	if(send == 7){
	System.out.println(" \n  send\n  ");
	 }
	System.out.print("Enter 8 for option: ");
	int option = input.nextInt();
	if(option == 8){
	System.out.println("Option \n  1.Type of view \n  2.Memory status\n  ");
	 }
	
	
	 }


System.out.print("Enter 2 to navigate message: ");
	int message = input.nextInt();
	if(message == 2){
	
	System.out.println("Message menu \n  1.Write message \n  2.Inbox \n  		  	3.Outbox \n 	4.Picture messages \n 5.Templates \n 6.Smileys \n 7.Message 	  	settings \n  	1.set  \n    1.Message centre number     \n    2.Messages 	sent as \n    3.Message validity \n   2.Common \n    1.Delivery reports \n    	2.Reply via same centre \n    3.Character support \n  8.Infor servic \n  9.Voice 	mailbox number \n  10.Service command editor "); 
  	 

	System.out.print("Enter: ");
	int number = input.nextInt();
	if(number == 1){
	System.out.println("\n Write message ");
	 }
	if(number == 2){
	System.out.println("\n inbox  ");
	}
	if(number == 3){
	System.out.println("\n Outbox  ");
	}
	if(number == 4){
	System.out.println("\n Picture message ");
	}
	if(number == 5){
	System.out.println("\n Template  ");
	}
	if(number == 6){
	System.out.println("\n Smileys  ");
	 }
	System.out.print("Enter 7 for Message setting");
	int messageSetting = input.nextInt();
	if(messageSetting == 7){
	System.out.println("\n Message settings \n   1.Set \n    1.Message centre number    	\n    2.Message sent as \n    3Message validity \n   2.Common                            	\n    1.Delivery report \n    2.Reply via same centre \n    3.Character support");
	 }
	 
	System.out.print("Enter 0 for set");
	int set = input.nextInt();
	if(set == 0){
	System.out.println("\n   Set \n     1.Message centre number \n     2.Message sent 	as \n     3.Message validity ");
	
	
	if(set == 1){
	System.out.println("\n      Message centre number ");
	}

	if(set == 2){
	System.out.println("\n      Message sent as ");
	}
	
	if(set == 3){
	System.out.println("\n      Message validity ");
	  }
	 }
	System.out.print("Enter 2 for common");
	int common = input.nextInt();
	if(common == 2){
	System.out.println("\n   Common \n     1.Delivery report				 \n     2.Reply via same centre  \n     3.Character support ");
	
	if(common == 1){
	System.out.println("\n   Common \n     Delivery report");
	}

	if(common == 2){
	System.out.println("\n     Reply via same centre");
	   }

	if(common == 3){
	System.out.println("\n     Charactre support");
	   }
	 }
	
	if(number == 8){
	System.out.println("\n8.Info service ");
	}

	if(number == 9){
	System.out.println("\n9.Voice mailbox number ");
	}

	
	if(number == 10){
	System.out.println("\n10.Service command editor ");
	        
             }
         }  

System.out.print("Enter 3 to Chat: ");
int chat = input.nextInt();
 if(chat == 3){
	System.out.println("3.chat\n");
}

System.out.print("Enter 4 to navigate call register: ");
int callRegister = input.nextInt();
 if(callRegister == 4){
	System.out.println("4.Call register \n  1.Missed calls \n  2.Received calls \n  3.Dialed calls \n  4.Erase recent call lists \n  5.Show call duration    \n1.Last call duration \n    2.all calls' duration \n    3.Received calls' duration \n    4.Dailled calls' duration \n    Clear timers \n  6.Show costs \n    1.Last call costs \n    2.All calls cost \n3.Clear counters \n  7.Call cost settings \n    1.Call cost limit \n    2.Show costs in \n  8.Prepaid credit \n  ");
  
if(callRegister == 1){
System.out.println("Call register menu \n   Missed calls");
}

if(callRegister == 2){
System.out.println("\n   Received calls");
}


if(callRegister == 3){
System.out.println("\n   Dialled calls");
}


if(callRegister == 4){
System.out.println("\n   Erase recent call lists");
 }
}
System.out.print("Enter  5 to show call duration: ");
int showCallDuraton = input.nextInt();
if(showCallDuraton == 5){
System.out.println("\n   Show call duration \n    1.Last call duration \n    2.All costs' duration \n    3.Received calls' duration \n    4.Dailled calls' duration \n    5.Clear timers");


if(showCallDuraton == 1){
System.out.println("\n     Last call duration");
}

if(showCallDuraton == 2){
System.out.println("\n     All calls' duration");
}

if(showCallDuraton == 3){
System.out.println("\n     Received calls' duration");
}

if(showCallDuraton == 4){
System.out.println("\n     Dialled calls' duration");
}

if(showCallDuraton == 5){
System.out.println("\n     Clear timers");
  }
 }

System.out.print("Enter  6 to show call costs: ");
int showCallCost = input.nextInt();
if(showCallCost == 6){
System.out.println("\n   Show call cost \n     1.Last call cost \n     2.All calls' cost \n     3.Clear counter");

if(showCallCost == 1){
System.out.println("\n     Last call cost");
}

if(showCallCost == 2){
System.out.println("\n     All calls' cost");
 }

if(showCallCost == 3){
System.out.println("\n     Clear counters");
 }
}
System.out.print("Enter 7 for call costs settings: ");
int callCostSetting = input.nextInt();
if(callCostSetting == 7){
System.out.print("\n   Call cost settings \n     1.Call cost limit \n     2.Show costs in");

if(callCostSetting == 1){
System.out.println("\n     call cost limit");

 }

if(callCostSetting == 2){
System.out.print("\n     Show cost in");

 }

System.out.print("\nEnter 8 for prepaid credit: ");
int prepaidCredit = input.nextInt();
if(prepaidCredit == 7){
System.out.println("\n   Prepaid credit");

  }
}

System.out.print("Enter  5 for tone: ");
int tone = input.nextInt();
switch(tone){
 case 1: System.out.print("Ringingtone");
 break;
 case 2: System.out.print("Ring volume");
 break;
 case 3: System.out.print("Incoming call alert");
 break;
 case 4: System.out.print("Composer");
 break;
 case 5: System.out.print("Message alert tones");
 break;
 case 6: System.out.print("Keypad tones");
 break;
 case 7: System.out.print("Warning and game tones");
 break;
 case 8: System.out.print("Vibrating alert");
 break;
 case 9: System.out.print("Screen saver");
 break;
 default:

 }

System.out.print("Enter  6 for Settings: ");
int settings = input.nextInt();
switch(settings){
 case 1: System.out.print("call settings");
 break;
 default:

 }

System.out.print("Enter  1 for Phone settings: ");
int callSettings = input.nextInt();
switch(callSettings){
 case 1: System.out.print("Automatic redial");
 break;
 case 2: System.out.print("Speed dialling");
 break;
 case 3: System.out.print("Call waiting options");
 break;
 case 4: System.out.print("Own number sending");
 break;
 case 5: System.out.print("Phone line in use");
 break;
 case 6: System.out.print("Automatic answer");
 break;
 default:

  }
 
System.out.print("Enter  2 for phone settings: ");
int phoneSettings = input.nextInt();
switch(phoneSettings){
 case 1: System.out.print("Language");
 break;
 case 2: System.out.print("Cell info display");
 break;
 case 3: System.out.print("Welcome note");
 break;
 case 4: System.out.print("Network selection");
 break;
 case 5: System.out.print("Light");
 break;
 case 6: System.out.print("Confirm Sim service actions");
 break;
 default:

  }

System.out.print("Enter for Security settings: ");
int securitySettings = input.nextInt();
switch(securitySettings){
  case 1 -> System.out.println(" PIN code request ");
  
  case 2 -> System.out.println(" Call barring service ");
   
  case 3-> System.out.println(" Fixet dialling ");
   
  case 4 -> System.out.println(" Close user group ");
   
  case 5 -> System.out.println(" Phone security ");
   
  case 6 -> System.out.println(" Change access codes ");
   
 default -> System.out.println("Enter the right number");

  }

System.out.print("Enter  4 for REstore factory settings: ");
int restorFactorySettings = input.nextInt();
switch(restorFactorySettings){ 
   case 0 -> System.out.print(" Change access codes ");
    
default -> System.out.println("Enter the right number");
	}


}
}