package ch10_collection;

import java.util.List;

// Dao(Data Access Object) 클래스
// 데이터 베이스와 직접 연동하여 데이터를 추가, 수정, 삭제, 조회 등의 업무를 처리하는 클래스
// 통상적으로 해당 Bean 클래스의 이름에 접미사 Dao를 붙여서 사용합니다.
// 각각의 단위 업무(추가, 수정, 삭제, 조회 등)들은 메소드로 구현합니다.
public class HaksengDao {
    private List<Hakseng> datalist = null ;

    public void PushData(List<Hakseng> lists) {
        // 넘겨진 리스트 컬렉션을 데이터 베이스에 저장해야 합니다.
        System.out.println("데이터 베이스에 추가 요청이 들어 왔습니다.");
        this.datalist = lists ;
    }

    public int getSize() {
        System.out.println("데이터 개수를 반환해 줍니다.");
        return this.datalist.size() ;
    }

    public void InsertData(Hakseng bean) {
        // Bean 데이터 1개를 추가합니다.
        this.datalist.add(bean) ;
    }

    public List<Hakseng> SelectAll() {
        // 게시물 전체 목록을 반환해 줍니다.
        return this.datalist ;
    }
}
