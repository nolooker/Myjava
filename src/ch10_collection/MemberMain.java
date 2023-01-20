package ch10_collection;

public class MemberMain {
	public static void main(String[] args) {
		MemberDao map = new MemberDao();

		map.addMember(new Member(1003, "삼장법사", 30, "남자"));
		map.addMember(new Member(1004, "사오정", 40, "여자"));

		map.addMember(new Member(1001, "저팔계", 10, "남자"));
		map.addMember(new Member(1002, "손오공", 20, "남자"));

		map.showAllMember();

		map.removeMember(1004);
		map.showAllMember();

		map.removeAllMember();
		System.out.println(map.getSize());
	}
}
