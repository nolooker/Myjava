package ch07_utility_classes;

public class GetName2 {
    public static void main(String[] args) {
        final String what = "강호동" ;
        String target = "강호동강호동유재석김철수강호동";
        System.out.println("문자열 원본 : " + target);

        int idx = 0;
        int len = what.length() ; // 찾고자 하는 단어의 문자열 길이
        int cnt = 0 ; // 카운터 변수

        while(true){
            idx = target.indexOf(what) ;
            if (idx == -1){
                String imsi = "%s는 더이상 존재하지 않습니다.\n" ;
                System.out.printf(imsi, what);
                break;
            }else{
                target = target.substring(idx + len) ;
                System.out.println("새롭게 추출된 문자열  : " + target);
                cnt++ ;
            }
        }

        String message = "문자열 %s은(는) %d번 발견되었습니다.\n";
        System.out.printf(message, what, cnt);
    }
}
