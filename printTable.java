public class printTable{

public static void main(String[] arge){

System.out.printf("%s%5s%5s%5s%n", "N", "N2", "N3", "N4");

int result = 0;

for(int number = 1; number <= 5; number++){

for(int number2 = 1; number2 <= 5; number2++){

result = number * number2;

System.out.printf("%5d  ", result);
}
if(result == 4){
}


System.out.println();
}
}
}
