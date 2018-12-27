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
		
		FileReader fr ;
		BufferedReader buffer ;
		
		try {
			fr = new FileReader(strFile2);
			buffer = new BufferedReader(fr);
			
			while(true) {
				String strRead = buffer.readLine();
				if(strRead == null) break;
				ComeVO vo = new ComeVO();
				String[] strReads = strRead.split(":");
				vo.setStrDate(strReads[0]);
				vo.setStrCode(strReads[1]);
				vo.setIntInout(Integer.valueOf(strReads[2]));
				vo.setIoPrice(Integer.valueOf(strReads[3]));
				vo.setIntSu(Integer.valueOf(strReads[4]));
				
				ioList.add(vo);
				
			}
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
	public void matchFile() {
		for(ComeVO vo : comeList) {
			for(ComeVO v : ioList) {
				if(v.getStrCode().equals(vo.getStrCode())) {
					v.setStrName(vo.getStrName());
					
				}
			}
		}
	}
	public void fileWrite() {
		PrintWriter pw;
		try {
			pw = new PrintWriter(strSave);
			for(ComeVO vo : ioList) {
				int intTotal = vo.getIoPrice() * vo.getIntSu() ;
				if(vo.getIntInout() == 1) {
					pw.println(vo.getStrDate() + ":" +
								"매입" + ":" +
								vo.getStrCode() + ":" +
								vo.getStrName() + ":" +
								vo.getIoPrice() + ":" +
								vo.getIntSu() + ":" +
								intTotal + ":" + 0);
				} else {
					pw.println(vo.getStrDate() + ":" +
							"매출" + ":" +
							vo.getStrCode() + ":" +
							vo.getStrName() + ":" +
							vo.getIoPrice() + ":" +
							vo.getIntSu() + ":" +
							0 + ":" + intTotal);
				}
			}
			System.out.println("저장 완료");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
