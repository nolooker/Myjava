package ch11_lamdba_expression.streamtest;

import ch11_lamdba_expression.model.DataCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("배열 스트림 사용하기");
        String[] nameArr = DataCollection.getArrayData01();
        Stream<String> nameStream = Arrays.stream(nameArr) ;
        nameStream.forEach(saram -> System.out.print(saram + "\t"));
        System.out.println();

        System.out.println("정수형 배열을 이용한 스트림 사용하기");
        int[] scores = DataCollection.getArrayData02();
        IntStream intStream = Arrays.stream(scores);
        intStream.forEach(su -> System.out.print(su + "\t"));
        System.out.println();

        System.out.println("컬렉션을 이용한 스트림 사용하기");
        List<String> namelist = DataCollection.getNameStringList();
        System.out.println("확장 for 사용하기");
        for(String item : namelist){
            System.out.print(item + "\t") ;
        }
        System.out.println();

        Stream<String> nameListStream = namelist.stream();
        nameListStream.forEach(name -> System.out.print(name + "\t"));
        System.out.println();

        System.out.println("정수 컬렉션을 이용한 스트림 사용하기");
        List<Integer> scorelist = DataCollection.getIntegerList();
        Stream<Integer> scoreListStream = scorelist.stream();
        scoreListStream.forEach(su -> System.out.print(su + "\t"));
        System.out.println();
    }
}
