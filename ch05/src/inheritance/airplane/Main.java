package inheritance.airplane;

public class Main {

	public static void main(String[] args) {
		SuperSonicAirPlane sa = new SuperSonicAirPlane();
		
		sa.이륙하다();
		sa.비행하다();
		
		// 모드 변경: static 사용시 클래스 이름(SuperSonicAirPlane)으로 직접 접근
		sa.flyMode = SuperSonicAirPlane.SUPERSONIC; // 모드 변경
		sa.비행하다();
		
		sa.flyMode = SuperSonicAirPlane.NOMAL;
		sa.비행하다();
		
		sa.착륙하다();

	}

}
