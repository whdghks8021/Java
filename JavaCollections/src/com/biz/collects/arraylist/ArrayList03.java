package com.biz.collects.arraylist;

import java.util.ArrayList;

public class ArrayList03 {
	
	// ArrayList 
	// 	 다수의 객체를 다루기 위한 java의 Collection이며
	//   최초 생성될때는 size()가 0 이며 필요에 따라 값을추가, 삭제하며
	//   크기를 자유롭게 설정하여 쓸 수 있다.
	
	//   arrayList.add(값) : 끝에 값을 추가할때
	//   arrayList.add(3,값) : 2번과 3번사이에 값을 끼워 넣을때
    //   arrayList.get(3) : 3번 위치의 값을 읽을때
	//   arrayList.set(4,값) : 4번 위치의 값을 변경할때
	//   arrayList.remove(5) : 5번 위치의 값을 삭제
	//   arrayList.remove(값) : 숫자형이 아닌경우 arrayList중 처음 나타나는 값 항목을 삭제
	//   arrayList.clear() : 모든 값을 삭제하고 size를 0으로 reset
	//   arrayList.size() : 리스트의 개수 확인

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList();
		
		strList.add("사과");
		strList.add("배");
		strList.add("토마토");
		strList.add("망고");
		strList.add("단감");
		
		int nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("=================================");
		strList.add(3, "바나나");
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("=================================");
		strList.remove(2);
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("==============================");
		strList.add("대봉");
		strList.add(1,"대봉");
		strList.add(3,"대봉");
		strList.add(5,"대봉");
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("==============================");
		strList.remove("대봉"); // 처음만나는 '대봉' 글자를삭제
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("=========================");
		nSize = strList.size(); 
		for(int i = 0 ; i < nSize ; i ++) { // 전체목록중 '대봉' 글자를 삭제
			strList.remove("대봉");
		}
		nSize = strList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(strList.get(i));
		}

	}

}
