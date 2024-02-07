public class Time1Test {

public static void main(String[] args) {

Time1 myTime = new Time1();

System.out.printf("After the time object has been created ", myTime);

System.out.println();

myTime.setTime(13, 27, 6);
System.out.println();

try{
myTime.setTime(99, 99, 99);
}
catch(IllegalArgumentException e) {
System.out.printf("exception: %s%n%n", e.getMessage());
}

System.out.printf("After calling steTime with invalid values", myTime);
}

private static void displayTime(String header, Time1 t) {
System.out.printf("%s%NUniversal mytime: %s%nStandrd myTime: %s%n", header, t.toUniversalString(), t.toString());

}
}