package com.biz.control;

public class ControlTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum1 = 33;
		int intMode = (intNum1 %2); // 이 두가지의 명령문을 압축한것이 
		boolean b = (intNum1 == 0); // 아래 if( (intNum1 %2) == 0 ) 이다.
		
		if( (intNum1 %2) == 0 ) {
			System.out.println(intNum1 + " 은 짝수");
		} else {
			System.out.println(intNum1 + " 은 홀수");
		}
		
		// if 나 else 뒤에 명령문이 한줄만 나오면 중괄호{}를 생략해도 된다.
		// if 문에 중괄호가 없으면 바로 다음 한문장만 if문의 영향을 받는다.
		if( (intNum1 %2) == 0 )
			System.out.println(intNum1 + " 은 짝수");
		else
			System.out.println(intNum1 + " 은 홀수");
		// if 명령문 뒤에 ;을 넣게되면 그 아래 명령문들은 if문의 영향을 받지 않는다.
		if( (intNum1 %2) == 0 ) ;
		System.out.println(intNum1 + " 은 짝수");
		
		
	}

}
