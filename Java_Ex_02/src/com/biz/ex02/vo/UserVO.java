package com.biz.ex02.vo;

public class UserVO {
	
	private String strNum;
	private String strName;
	private String strGrade;
	private String strAdd;
	private String strTel;
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public String getStrName() {
		return strName;
	}
	public void setStrName(String strName) {
		this.strName = strName;
	}
	public String getStrGrade() {
		return strGrade;
	}
	public void setStrGrade(String strGrade) {
		this.strGrade = strGrade;
	}
	public String getStrAdd() {
		return strAdd;
	}
	public void setStrAdd(String strAdd) {
		this.strAdd = strAdd;
	}
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	@Override
	public String toString() {
		return "UserVO [strNum=" + strNum + ", strName=" + strName + ", strGrade=" + strGrade + ", strAdd=" + strAdd
				+ ", strTel=" + strTel + "]";
	}

}
