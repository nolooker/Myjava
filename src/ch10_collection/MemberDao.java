package ch10_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MemberDao {
	private Map<Integer, Member> map;

	public MemberDao(){
		map = new HashMap<Integer, Member>();
	}

	public void addMember(Member member){
		int id = member.getId();
		System.out.println(id + "번 아이디가 추가됩니다.");
		map.put(id, member);
	}

	public boolean removeMember(int memberId){
		if(map.containsKey(memberId)){
			System.out.println(memberId + "가 목록에서 지워집니다.");
			map.remove(memberId);
			return true;
		}

		System.out.println(memberId + "가 존재하지 않습니다");
		return false;
	}

	public void showAllMember(){
		System.out.println("\n모든 회원 정보를 출력합니다.");
		Set<Integer> keylist = map.keySet();
		for(Integer key:keylist){
			Member mem = map.get(key) ;
			System.out.println(mem);
		}
		System.out.println();
	}

	public void removeAllMember() {
		System.out.println("회원 목록을 전부 삭제합니다.");
		map.clear();
	}

	public String getSize() {
		return "요소 개수 : " + map.size();
	}
}
