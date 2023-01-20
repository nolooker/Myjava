package ch10_collection;

import java.util.ArrayList;
import java.util.List;

public class HaksengMain {
    public static void main(String[] args) {
        List<Hakseng> lists = new ArrayList<Hakseng>() ;

        lists.add(new Hakseng("박영희", 1, 4, 70, 80, 90)) ;

        Hakseng soo = new Hakseng("김철수", 1, 3, 30, 40, 50) ;
        lists.add(soo) ;

        lists.add(new Hakseng("홍길동", 1, 5, 40, 50, 60)) ;
        
        System.out.println("요소의 갯수 : " + lists.size());

        HaksengDao dao = new HaksengDao() ;
        dao.PushData(lists) ;

        int size = dao.getSize();
        System.out.println("Dao에서 개수 얻어 오기 : " + size);

        Hakseng choi = new Hakseng("최우", 1, 5, 40, 50, 60) ;
        dao.InsertData(choi); // 1건 추가하기
        System.out.println("추가된 후 개수 : " + dao.getSize());

        List<Hakseng> printdata = dao.SelectAll();
        if(printdata == null){
            System.out.println("목록이 존재하지 않습니다.");
        }else{
            String printTitle = "이름\t학년\t반\t국어\t영어\t수학\t총점\t평균" ;
            System.out.println("\n방법01) 확장 for를 사용한 출력");
            System.out.println(printTitle);

            for(Hakseng bean:printdata){
                showData(bean);
            }

            System.out.println("\n방법02) get(숫자) 메소드를 이용한 출력");
            System.out.println(printTitle);
            for (int i = 0; i < printdata.size(); i++) {
                Hakseng bean = printdata.get(i) ;
                showData(bean);
            }
        }
    }

    private static void showData(Hakseng bean) {
        String SEPARATOR = "\t" ;

        String name = bean.getName() ;
        int grade = bean.getGrade() ;
        int ban = bean.getBan() ;
        int kor = bean.getKor();
        int eng = bean.getEng();
        int math = bean.getMath() ;
        int total = kor + eng + math ;
        double average = (double)total/3; ;

        String imsi = name + SEPARATOR + grade + SEPARATOR + ban + SEPARATOR + kor + SEPARATOR + eng + SEPARATOR + math + SEPARATOR + total + SEPARATOR + average ;
        System.out.println(imsi);
    }
}
