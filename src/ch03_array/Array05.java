package ch03_array;

public class Array05 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);

//        for (int i = 0; i < 10 ; i++) {
//            System.out.println(Math.random());
//        }

        double[] arr = new double[5] ;
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = Math.random() ;
        }

        System.out.println("요소들 출력하기");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 실수로 표현 가능한 수 중에서 가장 적은 숫자를 최대 값이라고 가정합니다.
        double max = Double.MIN_VALUE ;
        double min = Double.MAX_VALUE ;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i] ;
            }

            if(min > arr[i]){
                min = arr[i] ;
            }
        }
        System.out.println("\n최대 값 : " + max);
        System.out.println("최소 값 : " + min);
    }
}
