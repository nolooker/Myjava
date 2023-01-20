package ch12_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//          문자열 스트림   바이트 스트림
// 읽기        Reader      InputStream
// 쓰기        Writer      OutputStream
// Buffer) 메모리의 처리 속도 향상을 위한 보조 스트림


public class FileWriterEx {
    public static void main(String[] args) {

        // 폴더 구분자 작성시 슬래시는 1개, 역슬래시는 2개로 표현
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        System.out.println(pathname);

        String filename = pathname + "jumsu.txt";
        System.out.println(filename);

        File target = new File(filename);

        FileWriter fw = null;
        BufferedWriter bw = null;

        System.out.println("파일을 기록중입니다.");
        try {

            fw = new FileWriter(target);
            bw = new BufferedWriter(fw);

            // 여기서 파일에 기록하기
            bw.write("제시카,60.0,70.0,80.0,F");
            bw.newLine();
            bw.write("홍길동,50.0,70.0,100.0,M");
            bw.newLine();
            bw.write("유재석,60.0,70.0,80.0,M");
            bw.newLine();
            bw.write("티파니,40.0,80.0,50.0,F");
            bw.newLine();

            System.out.println("파일 기록 종료");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (bw != null) {bw.close();}
                if (fw != null) {fw.close();}

            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
