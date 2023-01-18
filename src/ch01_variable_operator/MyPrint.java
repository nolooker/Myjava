package ch01_variable_operator;

// 주석(comment) : 프로그램의 이해를 돕기 위하여 작성하는 작은 문구
// 한 줄 주석은 슬래시 2개로 작성합니다.
/*
    목적 : 자바 1번째 프로그래밍
    작성 일자 : 2022/12/29
    작성자 : 홍길동
    여기는 multiline 주석 영역입니다.
*/
public class MyPrint { // 클래스 바디(body)

    // 함수=동작=역할=메소드
    // main 메소드 : 프로그램 최초 시작(entry point) 하는 지점
    public static void main(String[] args) {  // 메소드 바디(body)
        // 문자열은 0개 이상의 글자의 집합
        // 반드시 쌍따옴표로 둘러 싸야 합니다.
        // cf) 문자는 글자 1개를 의미하는 데, 반드시 외따옴표로 둘러 싸야 합니다.
        // println 메소드 : 문자열을 출력한 다음, 엔터키를 눌러 줌
        // 모든 문장의 끝에는 반드시 세미콜론이 붙어야 합니다.
        System.out.println("홍");
        System.out.println();
        System.out.println("길");
        System.out.println("동");

        // print 메소드 : 문자열을 출력만 해줌
        System.out.print("대한");
        System.out.print("민국");
        System.out.print("화이팅");
        System.out.println();

        // 특수 문자는 반드시 역슬래시를 앞에 붙여 주어야 합니다.
        System.out.println("\"예체능\" 메인 프로그램 MC \'강호동\'");

        System.out.println("이름\t국어\t영어\t수학\n\n\n");
        System.out.println("김철수\t50\t60\t70");
        System.out.println("박영희\t30\t40\t50");
    }
}



