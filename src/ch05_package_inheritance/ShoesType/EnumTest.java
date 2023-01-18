package ch05_package_inheritance.shoestype;

public class EnumTest {
    public static void main(String[] args) {
        Shoes shoe01 = new Shoes("나이키", 235, ShoesType.RUNNING);
        shoe01.Display();

        System.out.println("요소별 출력");
        // values() : 요소들의 목록을 배열로 반환해 줍니다.
        ShoesType[] mylist = ShoesType.values();
        for (int i = 0; i < mylist.length; i++) {
            String value = mylist[i].toString() ;
            int idx = mylist[i].ordinal() ; // 각 항목의 색인 번호를 반환해줍니다.

            String message = "값 : %s, 색인 : %d\n" ;
            System.out.printf(message, value, idx);
        }

        System.out.println("====================================");
        Shoes shoe02 = new Shoes("뉴밸런스", 260, ShoesTypeName.TRACKING) ;
        shoe02.Display02();
    }
}
