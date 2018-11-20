package com.biz.interfaces.imp;

public class AniExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bunny bunny = new Bunny();
		
		
		view(dog);
		view(cat);
		view(bunny);
	}
	public static void view(Animal a) {
		// view를 호출할때 어떤 type의 변수를
		// 전달 했는가 알아보는 코드
		if(a instanceof Dog) {
			System.out.println("강아지");
		} else if(a instanceof Cat) {
			System.out.println("고양이");
		} else if(a instanceof Bunny) {
			System.out.println("토끼");
		} else {
			System.out.println("Animal");
		}
	}
	
	/*
	public static void view(Dog dog) {
	System.out.println("강아지");
		
	}
	public static void view(Cat cat) {
		System.out.println("야옹이");
	}	
	*/
	

}
