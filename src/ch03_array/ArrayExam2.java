package ch03_array;

public class ArrayExam2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3] ;

        arr[0][0] = 3 ;
        arr[0][1] = 5 ;
        arr[0][2] = 6 ;

        arr[1][0] = 7 ;
        arr[1][1] = 2 ;
        arr[1][2] = 8 ;

        System.out.println("행 개수 : " + arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "번째 행의 열 개수 : " + arr[i].length);
        }

        System.out.println("배열 요소 출력");
        for (int i = 0; i < arr.length; i++) { // 행(row)
            for (int j = 0; j < arr[i].length; j++) { // 열(column)
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("초기화 기법");
        int[][] brr = {{10, 20}, {30, 40, 50}} ;

        System.out.println("행 개수 : " + brr.length);

        for (int i = 0; i < brr.length; i++) {
            System.out.println(i + "번째 행의 열 개수 : " + brr[i].length);
        }

        System.out.println("배열 요소 출력");
        for (int i = 0; i < brr.length; i++) { // 행(row)
            for (int j = 0; j < brr[i].length; j++) { // 열(column)
                System.out.print(brr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
