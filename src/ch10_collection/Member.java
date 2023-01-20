package ch10_collection;

public class Member implements Comparable<Member>{
	private int id;        //회원 아이디
	private String name;   //회원 이름
	private int age ;
	private String gender;

	public Member(int id, String name, int age, String gender) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	@Override
	public String toString(){   //toString 메소드 오버로딩
		String imsi = "" ;
		imsi += "아이디 : " + this.id ;
		imsi += ", 이름 : " + this.name ;
		imsi += ", 나이 : " + this.age ;
		imsi += ", 성별 : " + this.gender ;
		return imsi;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if( obj instanceof Member){
			Member member = (Member)obj;
			if( this.id == member.id )
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int compareTo(Member member) {

		//return (this.id - member.id);   //오름차순
		return (this.id - member.id) *  (-1);   //내림 차순
	}
}