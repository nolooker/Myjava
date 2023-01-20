package ch12_stream;

import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class JumsuStream {
    public static void main(String[] args) {
        String pathname = System.getProperty("user.dir") + "\\src\\data\\" ;
        String source = pathname + "jumsu.txt" ; // 읽어 들일 파일
        String target = pathname + "result.txt" ; // 생성할 파일

        BufferedReader br = null ;
        BufferedWriter bw = null ;

        try {
            br = new BufferedReader(new FileReader(new File(source))) ;
            bw = new BufferedWriter(new FileWriter(new File(target))) ;

            String oneline = "" ;
            while((oneline = br.readLine()) != null){
                String result = makeStr(oneline);
                //System.out.println(bw == null);
                bw.write(result);
                bw.newLine();
            }

            System.out.println("작업 완료");
        }catch (FileNotFoundException e){
            System.out.println(source + "은 존재하지 않는 파일입니다.");
            e.printStackTrace();

        }catch (IOException e) {
            System.out.println("입출력 예외가 발생하였습니다.");
            e.printStackTrace();

        }catch (Exception e) {
            System.out.println("기타 예외 발생");
            e.printStackTrace();
        }finally {
            try {
                if(br != null){br.close();}
                if(bw != null){bw.close();}
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static String makeStr(String oneline) {
//        String[] arr = oneline.split(",") ;
//        String name = arr[0] ;
//        double kor = Double.parseDouble(arr[1]) ;
//        double eng = Double.parseDouble(arr[2]) ;
//        double math = Double.parseDouble(arr[3]) ;
//        String gender = arr[4].equalsIgnoreCase("M") ? "남자" : "여자" ;

        String delimiter = "," ;
        StringTokenizer st = new StringTokenizer(oneline, delimiter);

        String name = st.nextToken() ;
        double kor = Double.parseDouble(st.nextToken()) ;
        double eng = Double.parseDouble(st.nextToken()) ;
        double math = Double.parseDouble(st.nextToken()) ;
        String gender = st.nextToken().equalsIgnoreCase("M") ? "남자" : "여자" ;

        double _total = kor + eng + math ;
        double _average = _total/3.0 ;

        String pattern = "###.0" ;
        DecimalFormat df = new DecimalFormat(pattern);
        String total = df.format(_total) ;
        String average = df.format(_average) ;

        String result = name + "/" + gender + "/" + total + "/" + average  ;
        return result ;
    }
}
