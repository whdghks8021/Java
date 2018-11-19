package com.biz.classex.children;

import com.biz.classex.parents.AnimalClass;

//클래스의 상속(extends)
//기존에 만들어서 잘 사용하던 클래스가 있는데
//새로운 기능을 추가하고 싶을때
//기존의 클래스를 수정하지 않고, 기능을 이어 받거나,
//이어받은 기능을 향상(변경), 나만의 개성을 추가 하는 것

public class CatClass extends AnimalClass {

	@Override // 재정의
	public void whatIsName() {
		// TODO Auto-generated method stub
		// super.whatIsName();
		System.out.println("나는 스핑크스 입니다");
	}
	
	

}
