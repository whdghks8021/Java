package com.biz.classes;

import java.util.ArrayList;
import java.util.List;

public class DogListClass {
	
	List<String> dogList ;
	String strName ;
	
	public DogListClass() {
		dogList = new ArrayList();
		this.strName = "감자";
	}
	
	public DogListClass(String strName) {
		this.strName = strName;
		dogList = new ArrayList();
		dogList.add(this.strName);
	}

}
