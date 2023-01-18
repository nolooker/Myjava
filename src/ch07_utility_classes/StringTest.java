package ch07_utility_classes;

public class StringTest {
    public static void main(String[] args) {
        String str1 = new String("SEOUL");
        String str2 = new String("korea");

        String stemp  ;
        stemp = str1.toLowerCase() + " " + str2.toUpperCase() ;
        System.out.println(stemp);

        StringBuffer sb = new StringBuffer(stemp);
        System.out.println(sb.reverse());

        StringBuffer str3 = new StringBuffer("abcd");
        System.out.println(str3);
        System.out.println(str3.insert(2, "xx"));
        System.out.println(str3.delete(3, 5));
        System.out.println(str3.reverse());

        String str4 = "대한민국" ;
        String str5 = " 화이팅" ;

        System.out.println("concat 메소드는 문자열 연결");
        System.out.println(str4.concat(str5));

        String somefile = "b.ppt" ;
        System.out.println("a로 시작하나요 ? " + somefile.startsWith("a.")); // endsWith()

        System.out.println("문자열 비교(대소문자 따짐) ? " + somefile.equals("B.PPT"));
        System.out.println("문자열 비교(대소문자 안따짐) ? " + somefile.equalsIgnoreCase("B.PPT"));

        String files = "a.XLS/b.ppt/c.doc/d.xls";

        String[] filename = files.split("/") ;


        int xls = 0, ppt = 0, doc = 0;
        // 메소드 체이닝 : 점(dot) 연산자를 연속적으로 작성하여 데이터를 추출하는 기법

        for (int i = 0; i < filename.length; i++) {
            if(filename[i].toLowerCase().endsWith(".ppt")){
                System.out.println(filename[i] + "는(은) 피피티 파일입니다.");
                ppt += 1 ;

            }else if(filename[i].toLowerCase().endsWith(".xls")){
                System.out.println(filename[i] + "는(은) 엑셀 파일입니다.");
                xls += 1 ;

            }else if(filename[i].toLowerCase().endsWith(".doc")){
                System.out.println(filename[i] + "는(은) 워드 파일입니다.");
                doc += 1 ;

            }else{
                System.out.println(filename[i] + "는(은) 기타 파일");
            }
        }
        String message = "엑셀 : %d, 피피티 : %d, 워드 : %d\n" ;
        System.out.printf(message, xls, ppt, doc);

    }
}
