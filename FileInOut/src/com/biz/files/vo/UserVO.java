package com.biz.files.vo;

public class UserVO {
	
	private String strID ;
	private String strPassWord ;
	private String strName ;
	
	public String getStrID() {
		return strID;
	}
	public void setStrID(String strID) {
		this.strID = strID;
	}
	public String getStrPassWord() {
		return strPassWord;
	}
	public void setStrPassWord(String strPassWord) {
		this.strPassWord = strPassWord;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	@Override
	public String toString() {
		return "UserVO [strID=" + strID + ", strPassWord=" + strPassWord + ", strName=" + strName + "]";
	}

}
