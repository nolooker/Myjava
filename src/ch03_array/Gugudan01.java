package ch03_array;

public class Gugudan01 {
    public static void main(String[] args) {


        for (int i = 2 ; i < 10 ; i++) { //행


            for (int j = 1; j < 10 ; j++) { //열

               // String temp = i +"*" + j + "=" + (i*j) ;
               // System.out.print(temp + "\t");

                String temp = "%d +%d = %2d\t" ;
                System.out.printf(temp, i , j ,(i*j) );

            }
            System.out.println();
        }
    }
}
