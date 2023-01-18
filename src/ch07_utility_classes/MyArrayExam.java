package ch07_utility_classes;

import java.util.Arrays;

public class MyArrayExam {
    public static void main(String[] args) {
        String[] arr1 = new String[3];
        Arrays.fill(arr1, "제시카");
        printArray(arr1) ;

        Arrays.fill(arr1, 1, 3, "티파니");
        printArray(arr1) ;

        Arrays.fill(arr1, 2, 3, "써니");
        printArray(arr1) ;

        String[] arr2 = {"제시카", "티파니", "써니"} ;
        String[] arr3 = {"제시카", "티파니", "써니", "효연"} ;

        System.out.println("배열 1과 2가 동일한가요");
        System.out.println(Arrays.equals(arr1, arr2));

        System.out.println("배열 1과 3이 동일한가요");
        System.out.println(Arrays.equals(arr1, arr3));

        Arrays.sort(arr3);
        printArray(arr3);

        String finddata = "제시카" ;
        int idx = Arrays.binarySearch(arr3, finddata) ;
        System.out.println(finddata + "의 인덱스 : " + idx);

        String[] arr4 = {"김", "이", "최", "박"} ;
        // 향상된 for 구문
        for(String str : arr4){ // for(타입  단수이름 :  복수이름 )
            System.out.println(str + "씨");
        }

        String[] arr5 = {"미국", "영국", "한국", "중국", "일본"} ;
        for (int i = 1; i <= 10 ; i++) {
            String[] arr6 = Arrays.copyOf(arr5, i) ;
            printArray(arr6);
        }

        String[] arr7 = Arrays.copyOfRange(arr5, 1, 4) ;
        printArray(arr7);

        String[] arr8 = {"나", "가", "아", "다", "라"} ;
        Arrays.sort(arr8, 1, 4);
        printArray(arr8);

        System.out.println(Arrays.toString(arr8));

    }

    private static void printArray(String[] array) {
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
