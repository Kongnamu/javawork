package kr.or.iei.run;

import kr.or.iei.model.User;

public class UserTest2 { // 시험준비

	public static void main(String[] args) {
		// 매개변수가 있는 생성자료 / user1 인스턴스 생성
		/* User user1 = new User("sky789", "12345", "홍길동");
		
		System.out.println("아이디: " + user1.getId());
		System.out.println("비밀번호: " + user1.getPwd());
		System.out.println("이름: " + user1.getName()); */
		
		//1. 크기가 3인 배열 생성
		User[] users = new User[3];
		
		
		//2. user3명 객체 생성
		User user1 = new User("sky789", "12345", "홍길동");
		User user2 = new User("sky567", "23456", "우영우");
		User user3 = new User("sky123", "234567", "손흥민");
		
		//3. 배열에 객체 저장
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		
		//4. 한개 우선 출력
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[0].getId() + ", " +
		users[0].getPwd() + ", " + users[0].getName());
		}
		
		System.out.println("==============================");
		
		//5. 전체 출력
		for(int i = 0; i < users.length; i++) {
			System.out.println(users[i].getId() + ", " +
		users[i].getPwd() + ", " + users[i].getName());
		}

	}

}
