package com.biz.commerce.exec;

import com.biz.commerce.service.ComeService;

/*
 * 지금부터 ComeExec01이라는 클래스를 시작한다.
 */
public class ComeExec01 {

	/*
	 * 이곳은 main 메서드가 시작하는 곳이다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 상품정보와 매입매출데이터 파일이 저장된 경로를 각각
		 * String 변수에 담아주고
		 * 
		 * 파일을 저장할 경로를 String 변수에 담아준다.
		 */
		String strFile1 = "src/com/biz/commerce/상품정보.txt";
		String strFile2 = "src/com/biz/commerce/매입매출데이터.txt";
		String strSave = "D:/bizwork/workspace/ExFiles/매입매출정보.txt";
		
		// 서비스클래스를 사용하기위해 선언을해주고,
		// 매개변수로 각각의 파일경로가 들어있는 변수를 넘겨준다.
		ComeService cs = new ComeService(strFile1, strFile2, strSave);

		// 상품정보파일을 읽어서 저장하는 method
		cs.readFile1();
		// 매입매출데이터를 읽어서 저장하는 method
		cs.readFile2();
		// 각각의 파일을 매치(비교)해서 코드가 일치하면 그 코드의 상품명을
		// 저장하는 method
		cs.matchFile();
		// 상품명까지 저장된 리스트를 파일에 저장하는 method
		cs.fileWrite();
	}

}
