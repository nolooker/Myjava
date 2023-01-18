package ch03_array;

public class MyArr01 {
    public static void main(String[] args) {
        int x = 3 ;
        int y = 5 ;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // new 연산자를 사용하는 방법
        int[] arr = new int[3] ;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        arr[0] = x - y + 6 ;
        arr[2] = arr[0] + 3 ;
        arr[1] = arr[0] + arr[2] ;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] brr = {10, 20} ; // 배열 초기화 기법
        for (int i = 0; i < brr.length; i++) {
            System.out.println(brr[i]);
        }
    }
}
