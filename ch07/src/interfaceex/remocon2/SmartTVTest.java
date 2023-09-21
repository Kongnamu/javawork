package interfaceex.remocon2;

import interfaceex.remocon.RemoteControl;

public class SmartTVTest {

	public static void main(String[] args) {
		//구현 객체(인스턴스) - tv
		SmartTV tv = new SmartTV();
		
		//구현 인스턴스를 인터페이스 타입에 저장(자동 형변환)
		RemoteControl rc = tv;
		Searchable searchable = tv;
		
		rc.turnOn();
		rc.setVolume(0);
		searchable.search("www.naver.com");
		rc.setMute(true);
		rc.turnOff();
		
		//static이므로 클래스 이름으로 직접 출력
		RemoteControl.changeBattery();
	}

}
