package ch03_array;

public class ArrayExam5 {
    public static void main(String[] args) {
        int[] aaa = {10, 20} ;
        int[][] arr = new int[2][3] ;

        for (int i = 0; i < arr.length; i++) { // 행(row)
            for (int k = 0; k < arr[i].length; k++) { // 열(column)
                arr[i][k] = i % arr.length + 3 * k + i ;
            }
        }

        System.out.println("before 배열 요소 출력");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        arr[0][2] = aaa[0] - 5 ;
        arr[1][1] = arr[0][2] * aaa[1] - 7 ;

        System.out.println("after 배열 요소 출력");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
