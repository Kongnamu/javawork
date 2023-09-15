package inheritance.q4; // 교재 연습문제: 오류 찾기

public class Engineer extends Employee {
	
	private String skillset;
	
	public Engineer(String name) {
		super(name); // super 키워드 필요
	}
	
	public String getSkillSet() {
		return skillset;
	}
	
	public void setSkillSet(String skillset) {// String 표기 오류
	this.skillset = skillset;
	}
}
