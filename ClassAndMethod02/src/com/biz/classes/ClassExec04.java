package com.biz.classes;

public class ClassExec04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DogClass dog1 = new DogClass() ;
		DogClass dog2 = new DogClass("감자") ;
		
		dog1.run();
		dog2.run();
		
		DogListClass dogList = new DogListClass();
		DogListClass dogList1 = new DogListClass("자몽");
		

	}

}
