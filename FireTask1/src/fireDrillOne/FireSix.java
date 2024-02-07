package fireDrillOne;

public class FireSix {

    public static void main(String[] args){

        for (int count = 1; count <= 10; count++) {



            if (count % 4 == 0) {
                int result = 1;
                for (int innercount = 1; innercount <= 5; innercount++) {

                    result *= count;
                    System.out.print(result +" ");

                }
            }
            System.out.print(" ");
        }

    }
}