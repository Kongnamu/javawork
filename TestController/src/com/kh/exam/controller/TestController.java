package com.kh.exam.controller;

import java.util.Arrays;
import java.util.Scanner;

public class TestController {
	public void test1() {

		Scanner sc = new Scanner(System.in);

		String[] personArr = new String[5];
		
		for(int i = 0; i < personArr.length; i++) {//length의 ()를 지워야함
		while (true) {
		System.out.print((i+1) + "번째 주민번호 입력 : "); // i+1 로수정

		String personId = sc.nextLine();

		if((personId.length() == 14)) {
		char gender = personId.charAt(7); // charAt(7)로 수정
		if(gender == '1' || gender == '2' || gender == '3' || gender == '4') { //작은 따옴표 넣어야함
		personArr[i] = personId.substring(0, 8) + "******";
		break;

		} else {

		System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");

		}

		} else {

		System.out.println("잘못된 주민번호 형식입니다. 다시입력하세요.");
		
		}
		}
		}

		System.out.println("--- 주민번호 정보 등록 완료 ---");

		System.out.println(Arrays.toString(personArr));

		}
	}
	
 
