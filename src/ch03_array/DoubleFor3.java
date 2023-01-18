package ch03_array;

public class DoubleFor3 {
    public static void main(String[] args) {

        int total = 0 ;

        for (int i = 1; i < 4 ; i += 2) {

            for (int j = 2; j < 6; j += 3) {

                total += 2*i + j ;

            } //end for
        }//end for

        System.out.println("총합 : " +total);
    }

}
