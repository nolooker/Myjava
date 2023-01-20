package ch12_stream;

import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class JumsuStream {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\";
        String source = pathname + "jumsu.txt";  // 읽을 파일
        String target = pathname + "result.txt"; // 생성할 파일

        BufferedReader br = null;
        BufferedWriter bw = null;

        System.out.println("파일 읽기 쓰기 시작");


        try {
            br = new BufferedReader(new FileReader(new File(source)));
            bw = new BufferedWriter(new FileWriter(new File(target)));

            String oneline = "";

            while ((oneline = br.readLine()) != null) {

                String result = makeStr(oneline);
                //    System.out.println(result);

                bw.write(result);
                bw.newLine();

            }


            System.out.println("파일 읽기 쓰기 종료");

        } catch (FileNotFoundException e) {
            e.printStackTrace();

            System.out.println(source + "해당 파일 존재 x");

        } catch (IOException e) {

            System.out.println("입출력 예외 시");
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println("기타 예외 발생");

        } finally {

            try {
                if (br != null) {
                    br.close();
                }
                if (bw != null) {
                    bw.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }

    private static String makeStr(String oneline) {

//        String[] arr = oneline.split(",");
//
//        String name = arr[0];
//        double kor = Double.parseDouble(arr[1]);
//        double eng = Double.parseDouble(arr[2]);
//        double math = Double.parseDouble(arr[3]);
//        String gender = arr[4].equalsIgnoreCase("M") ? "남자" : "여자";

        String delimiter = ",";
        StringTokenizer st = new StringTokenizer(oneline, delimiter);

        String name = st.nextToken();
        double kor = Double.parseDouble(st.nextToken());
        double eng = Double.parseDouble(st.nextToken());
        double math = Double.parseDouble(st.nextToken());
        String gender = st.nextToken().equalsIgnoreCase("M") ? "남자" : "여자";

        double _total = kor + eng + math;
        double _average = _total / 3;


        String pattern = "###.0"; //소수점 1자리까지 표시

//            DecimalFormat : 10진수에 대한 서식을 지정해주는 클래스
        DecimalFormat df = new DecimalFormat(pattern);

        String total = df.format(_total);
        String average = df.format(_average);

        String result = name + "/" + gender + "/" + total + "/" + average;

        return result;

    }
}
