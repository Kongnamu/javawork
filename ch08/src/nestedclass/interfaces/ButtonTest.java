package nestedclass.interfaces; //중첩 클래스 활용

public class ButtonTest {

	public static void main(String[] args) {
		//버튼 객체 생성
		Button button = new Button();
		
		//전화걸기 객체 생성
		CallListener call = new CallListener();
		button.setListener(call);
		button.touch();
		
		//문자보내기 객체 생성
		button.setListener(new MessageListener());
		button.touch();
		
		
		//사진찍기 구현
		button.setListener(new Button.OnClickListener() {
			
			@Override
			public void onClick() {
				System.out.println("사진을 찍습니다.");
			}
		});
		button.touch();
		
	}

}
