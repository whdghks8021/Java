package com.biz.files.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "src/com/biz/files/exec/우리말이름.txt";
		FileReader fr;
		BufferedReader buffer;

		try {
			fr = new FileReader(s);
			buffer = new BufferedReader(fr);

			while (true) {
				String readLine = buffer.readLine();
				if (readLine == null)
					break;
				System.out.println(readLine);
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

}
