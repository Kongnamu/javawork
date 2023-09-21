package abstracts.player;

public class Player {
	//PlayerLevel 참조
	private PlayerLevel level;
	
	//생성자
	public Player() {
		level = new Beginner();   //초보자 생성
		level.showLevelMessage(); //초보자입니다.
	}
	
	//레벨 업그레이드 메서드
	public void upgradeLevel(PlayerLevel level) {
		this.level = level; //중급자, 고급자를 위한 설정
		level.showLevelMessage();
	}
	
	//플레이어가 게임하는 메서드
	public void play(int count) {
		level.go(count);
	}
}
