public class MethodOverloadingTest{

public static void main(String[] args){

//System.out.printf(" the value of square int = %d%n ", //square(7)); 

//System.out.printf(" the value of square double = //%.2f%n ", square(7.5000)); 

square(7);
square(7.5000);

}

//public static void square (int intValue){


public static void square (){


//System.out.printf(" called Square with int argument %//d%n ", intValue);

 int result = intValue * intValue;

System.out.printf(" the value of square double = %d%n ", result); 

}



//public static void square (double doubleValue){

public static void square (){


//System.out.printf(" called Square with double //argument %f%n ", doubleValue);

 double result = doubleValue * doubleValue;

System.out.printf(" the value of square double = %.2f%n ", result); 


}

}