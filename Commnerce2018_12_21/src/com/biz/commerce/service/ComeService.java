package com.biz.commerce.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.biz.commerce.vo.ComeVO;
/*
 * 매입매출 관련 처리를 위한
 * 클래스를 선언
 */
public class ComeService {

	/*
	 * 각각의 데이터들을 관리할 List와 변수들을 선언
	 */
	List<ComeVO> comeList; // 상품정보 파일에 담긴 내용이 저장될 List
	List<ComeVO> ioList; // 매입매출데이터 파일에 담긴 내용이 저장될 List
	String strFile1 ; // 상품정보 파일의 경로
	String strFile2 ; // 매입매출데이터 파일의 경로
	String strSave ; // 매입매출정보 파일을 저장할 경로
	
	/*
	 * 이 서비스클래스를 사용하기위해서 호출되는 생성자를 선언한다.
	 * 이 생성자에는 각각 파일의 경로가 들어있는 변수를 매개변수로 받아서
	 * 이 서비스클래스에 선언한 변수에 저장해둔다.
	 * 또한 List를 사용하기위해 초기화 작업을 한다.
	 */
	public ComeService(String strFile1, String strFile2, String strSave) {
		comeList = new ArrayList(); // comeList는 ArrayList로 사용하기위해 초기화
		ioList = new ArrayList(); // ioList는 ArrayList로 사용하기위해 초기화
		this.strFile1 = strFile1; // 매개변수로받은 파일경로를 저장. (상품정보)
		this.strFile2 = strFile2; // 매개변수로받은 파일경로를 저장. (매입매출데이터)
		this.strSave = strSave; // 매개변수로받은 파일경로를 저장. (매입매출정보)
	}
	
	/*
	 * 파일을 읽어들이기 위한 method 선언 (상품정보 파일)
	 */
	public void readFile1() {
		// Text 파일을 읽기 위한 FileReader 객체 선언
		FileReader fr ;
		// FileReader와 연결하여 사용할 BufferedReader 객체 선언
		BufferedReader buffer ;
		
		try {
			/*
			 * 이 코드는 작동되는 과정에서 불가항력적인
			 * 문제가 발생할 소지가 있으므로
			 * 반드시 try..catch 문으로 감싸 주어야 한다
			 * 
			 * FileReader에게는 파일의경로가 있는 변수를 넘겨준다.
			 */
			fr = new FileReader(strFile1);
			/*
			 * FileReader로 open된 파일 정보를
			 * Buffer에 연결하여 준다.
			 * 이 코드가 실행되면
			 * BufferedReader는 일단 파일의 내용을
			 * 메모리의 buffer에 저장해 둔다.
			 */
			buffer = new BufferedReader(fr);
			
			/*
			 * 무한반복문을 이용해서
			 * Buffer에 저장된 파일내용에서
			 * 한줄씩 (문자열로) 읽어서 처리한다.
			 */
			while(true) {
				// buffer에서 한줄을 읽어서 strRead변수에 저장
				String strRead = buffer.readLine();
				// 그 저장된 값이 만약 null이면 모든 문자열을 다 읽은 것이므로
				// 반복문을 종료.
				if(strRead == null) break;
				/*
				 * 만약 반복문이 종료되지않고 넘어가게되면,
				 * 문자열이 담겨있으므로 그 문자열을 나누어서 담을
				 * vo 객체를 선언한다.
				 * vo는 변수들이 모여있는 주머니같은것 이다.
				 */
				ComeVO vo = new ComeVO();
				// 이제 저장된 문자열을 ":" 기준으로 나누어서
				// strReads라는 문자열배열에 넣어준다.
				// 그러면 strReads에는 0번부터 차례대로 나누어진 문자열이 저장된다.
				String[] strReads = strRead.split(":");
				// 저장된 문자열배열의 0번째 위치는 상품코드이므로 
				// vo에있는 StrCode변수에 세팅해 준다.
				vo.setStrCode(strReads[0]);
				// 문자열배열의 1번째 위치는 상품명이므로
				// vo에있는 StrName변수에 세팅해준다
				vo.setStrName(strReads[1]);
				
				/*
				 * 각각의 vo변수에 저장된 내용들을
				 * comeList에 저장해준다.
				 * comeList는 ComeVO를 자료형으로 만들었기때문에,
				 * vo내에 있는 변수를 저장할수 있다.
				 */
				comeList.add(vo);
				
			}
			/*
			 * 파일읽기를 완료하였으니, buffer와 fr을 닫아준다.
			 */
			buffer.close();
			fr.close();
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*
	 * 파일을 읽어들이기 위한 method 선언. (매입매출데이터 파일)
	 */
	public void readFile2() {
		// 파일을 열어서 읽은후 buffer에 저장하기위해 파일리더와 버퍼드리더를 선언
		FileReader fr ;
		BufferedReader buffer ;
		
		/*
		 * 이 코드는 작동되는 과정에서 불가항력적인
		 * 문제가 발생할 소지가 있으므로
		 * 반드시 try..catch 문으로 감싸 주어야 한다
		 * 
		 * FileReader에게는 파일의경로가 있는 변수를 넘겨준다.
		 */
		try {
			fr = new FileReader(strFile2);
			// buffer에게는 fr을 넘겨준다.
			buffer = new BufferedReader(fr);
			/*
			 * 무한반복문을 이용해서
			 * Buffer에 저장된 파일내용에서
			 * 한줄씩 (문자열로) 읽어서 처리한다.
			 */
			while(true) {
				// buffer에서 한줄을 읽어서 strRead변수에 저장
				String strRead = buffer.readLine();
				// 그 저장된 값이 만약 null이면 모든 문자열을 다 읽은 것이므로
				// 반복문을 종료.
				if(strRead == null) break;
				/*
				 * 만약 반복문이 종료되지않고 넘어가게되면,
				 * 문자열이 담겨있으므로 그 문자열을 나누어서 담을
				 * vo 객체를 선언한다.
				 * vo는 변수들이 모여있는 주머니같은것 이다.
				 */
				ComeVO vo = new ComeVO();
				// 이제 저장된 문자열을 ":" 기준으로 나누어서
				// strReads라는 문자열배열에 넣어준다.
				// 그러면 strReads에는 0번부터 차례대로 나누어진 문자열이 저장된다.
				String[] strReads = strRead.split(":");
				// 저장된 문자열배열의 0번째 위치는 날짜이므로 
				// vo에있는 StrDate변수에 세팅해 준다.
				vo.setStrDate(strReads[0]);
				// 저장된 문자열배열의 1번째 위치는 상품코드이므로 
				// vo에있는 StrCode변수에 세팅해 준다.
				vo.setStrCode(strReads[1]);
				// 저장된 문자열배열의 2번째 위치는 매출구분이므로 
				// vo에있는 IntInout변수에 세팅해 준다.
				// 이때 읽은값은 문자열형이고, IntInout은 숫자형이니
				// 자료형을 변환하여 숫자형으로 저장해준다.
				vo.setIntInout(Integer.valueOf(strReads[2]));
				// 저장된 문자열배열의 3번째 위치는 가격이므로
				// vo에있는 IoPrice변수에 세팅해 준다.
				// 이것도 자료형을 변환해준다.
				vo.setIoPrice(Integer.valueOf(strReads[3]));
				// 저장된 문자열배열의 4번째 위치는 수량이므로
				// vo에있는 IntSu변수에 세팅해 준다.
				// 이것도 자료형을 변환해준다.
				vo.setIntSu(Integer.valueOf(strReads[4]));
				
				/*
				 * 각각의 vo변수에 저장된 내용들을
				 * ioList에 저장해준다.
				 * ioList는 ComeVO를 자료형으로 만들었기때문에,
				 * vo내에 있는 변수를 저장할수 있다.
				 * 
				 * comeList에는 상품정보가, ioList에는 매입매출정보가 저장되게 된다.
				 */
				ioList.add(vo);
				
			}
			/*
			 * 파일읽기를 완료하였으니, buffer와 fr을 닫아준다.
			 */
			buffer.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/*
	 * 매출매입정보와 상품정보 리스트를 서로 비교해서
	 * 상품코드가 같으면 매입매출정보 리스트에 상품명을 추가해준다.
	 */
	public void matchFile() {
		// 상품정보리스트를 vo에 담는다
		for(ComeVO vo : comeList) {
			// 매출매입정보리스트를 v에 담는다
			for(ComeVO v : ioList) {
				// 매출매입정보리스트의 상품코드가 상품정보리스트에 상품코드랑 같으면
				// 매출매입정보리스트에 상품명을 추가해준다.
				if(v.getStrCode().equals(vo.getStrCode())) {
					v.setStrName(vo.getStrName());
					
				}
			}
		}
	}
	/*
	 * 이제 저장된 매출매입정보리스트를 파일로 저장하는 method를 생성한다.
	 */
	public void fileWrite() {
		// 파일저장을위해 PrintWriter를 선언
		PrintWriter pw;
		try {
			// PrintWriter에 파일의 저장경로를 문자열변수로 넣어준다.
			pw = new PrintWriter(strSave);
			// 매출매입리스트를 한줄씩 추출한다.
			for(ComeVO vo : ioList) {
				// 합계를 계산하기위해 intTotal변수에 가격과 수량을 곱한뒤 저장해준다.
				int intTotal = vo.getIoPrice() * vo.getIntSu() ;
				// 만약 매입매출구분이 '1'인경우는 매입인경우이다.
				if(vo.getIntInout() == 1) {
					// 파일에 저장할때 구분을 매입으로 바꿔주고 매출총액을 0원으로 세팅해준다.
					pw.println(vo.getStrDate() + ":" +
								"매입" + ":" +
								vo.getStrCode() + ":" +
								vo.getStrName() + ":" +
								vo.getIoPrice() + ":" +
								vo.getIntSu() + ":" +
								intTotal + ":" + 0);
				} else {
					// 구분이 1이 아닌경우는 0이기 때문에 구분을 매출로 바꿔주고
					// 매입총액을 0원으로 세팅해준다.
					pw.println(vo.getStrDate() + ":" +
							"매출" + ":" +
							vo.getStrCode() + ":" +
							vo.getStrName() + ":" +
							vo.getIoPrice() + ":" +
							vo.getIntSu() + ":" +
							0 + ":" + intTotal);
				}
			}
			// 완료되면 저장완료 라고 콘솔창에 메시지를 나타내준다.
			System.out.println("저장 완료");
			// 그리고 PrintWriter를 닫아준다.
			// 닫지않으면 PrintWriter가 계속 사용중이게 된다.
			// 그래서 파일이 저장되지 않는다.
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
