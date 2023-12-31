package switchexample;

public class SwitchCaseTest {

	public static void main(String[] args) {
		// 랭킹에 따른 매달 출력 
		// 1등 금메달, 2등 은메달, 3등 동메달
		// 변수: 순위(rank)
		
		int rank = 4;
		
		switch(rank) { //switch는 정해진 케이스에 맞춰 사용 가능
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:	
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
			default: // case 1,2,3에 해당되지 않는 것
			System.out.println("메달이 없습니다.");
			break;
		}

	}

}
