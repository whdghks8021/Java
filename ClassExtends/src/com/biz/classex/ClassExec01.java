package com.biz.classex;

//클래스의 상속(extends)
//기존에 만들어서 잘 사용하던 클래스가 있는데
//새로운 기능을 추가하고 싶을때
//기존의 클래스를 수정하지 않고, 기능을 이어 받거나,
//이어받은 기능을 향상(변경), 나만의 개성을 추가 하는 것

import com.biz.classex.children.CatClass;
import com.biz.classex.children.DogClass;
import com.biz.classex.parents.AnimalClass;

public class ClassExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog = new DogClass();
		CatClass cat = new CatClass();
		
		dog.strName = "감자";
		dog.whatIsName();
		
		dog.strColor = "White";
		dog.whatIsColor();
		
		cat.strName = "자몽";
		cat.whatIsName();
		
		AnimalClass animalClass = new AnimalClass();
		animalClass.strName = "포유류 동물";
		animalClass.whatIsName();
		

	}

}
