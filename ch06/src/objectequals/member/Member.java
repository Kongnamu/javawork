package objectequals.member;



public class Member {
	private String memberId; // 사번
	private String name; // 이름
	
	public Member(String memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	
    // equals() 재정의
	@Override
	public int hashCode() { //멤버이름.hashCode()를 반환해야함
		return memberId.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj; // Member형으로 다운 캐스팅
			if(this.memberId.equals(member.memberId));
			return  true; // 외부 입력된 회원아이디를 이미 생성된 회원아이디와 일치하면
		}
		return false;
	}
    //객체의 문자열 정보 - toString() 재정의
	@Override
	public String toString() {
		return memberId + ", " + name;
	}
	

}
