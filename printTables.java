public class printTables{

public static void main(String[] arge){

System.out.printf("%s  %6s  %6s  %6s  %n", "N", "N2", "N3", "N4");
int t = 1;

for(int number = 1; number <= 5; number++){
System.out.printf("%d  %6d  %6d  %6d  %n", t, t*t, t*t*t,t*t*t*t);
t++;
}

}

}