package ch10_collection;

public class ExtendFor {
    public static void main(String[] args) {
        int[] arr = {10, 30, 50};
        System.out.println("일반 for");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("확장(향상) for");
        for(int item:arr){
            System.out.println(item);
        }

        System.out.println();
        String fruits[] = new String[]{"apple", "melon", "orange"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        for(String item:fruits){
            System.out.println(item);
        }
    }
}
