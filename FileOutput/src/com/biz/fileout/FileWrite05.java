package com.biz.fileout;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String printFile = "D:/bizwork/workspace/ExFiles/filew05.txt";
		
		FileWriter fw ;
		
		try {
			fw = new FileWriter(printFile);
			for(int i = 0 ; i < 20 ; i ++ ) {
				fw.write(i);
				fw.write(":");
				
				int rndNum = (int)(Math.random() * 100) + 1;
				fw.write(rndNum + "\r\n");
				fw.flush(); // 메모리에 저장하지않고 즉시 파일에 기록
				            // 내용이 많으면 실행하는 속도가 느려짐
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
