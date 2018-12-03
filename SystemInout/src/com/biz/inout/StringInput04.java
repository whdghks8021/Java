package com.biz.inout;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StringInput04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String secLetter = "src/com/biz/inout/secletter.txt" ;
		
		FileReader fr;
		
		try {
			fr = new FileReader(secLetter);
			while(true) {
				int intRead = fr.read();
				if(intRead < 0) break;
				char cRead = (char)(intRead - 'A');
				System.out.print(cRead);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
