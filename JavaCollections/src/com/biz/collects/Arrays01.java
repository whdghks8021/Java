package com.biz.collects;

public class Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aa();
		
		// 나 자신(Arrays01 class)를 내가 객체로 별도로 선언하는 방식
		// 새로운 Arrays01을 복제한 객체 생성
		Arrays01 a = new Arrays01();
		// 새로 복제된 객체에 있는 static이 아닌 bb() method를 호출(사용)할수 있고
		a.bb();
		
		// Arrays01에 포함된 MyBook inner class를 사용할때는
		// 먼저 Arrays01을 별도로 객체로 생성(복제)하여 그 객체로 부터
		// new 키워드를 호출 사용해야 inner class를 사용할수 있다.
		MyBook myBook = a.new MyBook();
		myBook.strTitle = "자바야 놀자";
		myBook.strAuth = "남궁성";
		myBook.strComp = "영진문화사";
		
		
		

	}
	public void bb() {
		System.out.println("나는 bb입니다.");
		
	}
	
	public static void aa() {
		System.out.println("나는 aa입니다.");
	}
	
	// inner class
	// Arrays01 class 만을 위한 특별히 작성되는 class
	// inner class 첫 시작 키워드를 일반적으로 private으로 선언한다.
	private class MyBook {
		
		String strTitle;
		String strAuth;
		String strComp;
		
	}

}
