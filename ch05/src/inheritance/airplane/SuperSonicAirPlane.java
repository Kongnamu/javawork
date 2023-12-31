package inheritance.airplane;

public class SuperSonicAirPlane extends AirPlane{
	// 1- 일반비행, 2- 초음속비행
	static final int NOMAL = 1; // 상수 활용
	static final int SUPERSONIC = 2;
	
	int flyMode = NOMAL;
	
	@Override // 메서드 재정의
	public void 비행하다() {
		if(flyMode == SUPERSONIC) {
			System.out.println("비행기가 초음속 비행합니다.");
		}else {
			super.비행하다(); // 부모 메서드 생성 (super 사용)
		}
	}

}
