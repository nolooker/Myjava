package ch10_collection;

// 게시물 객체 1개를 생성하기 위한 클래스로써, 웹에서 Bean 클래스라고 부릅니다.
public class Board {
    private int no ; // 글번호
    private String title ; // 제목
    private String writer ; // 작성자
    private String regdate ; // 작성 일자
    private int readcount ; // 조회수

    public Board() {}

    public Board(int no, String title, String writer, String regdate, int readcount) {
        this.no = no;
        this.title = title;
        this.writer = writer;
        this.regdate = regdate;
        this.readcount = readcount;
    }

    public void setReadcount(int readcount) {
        this.readcount = readcount;
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getRegdate() {
        return regdate;
    }

    public int getReadcount() {
        return readcount;
    }

}
