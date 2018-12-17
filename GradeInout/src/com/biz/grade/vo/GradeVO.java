package com.biz.grade.vo;

public class GradeVO {
	
	private String strNum;
	private String strName;
	private String strTel;
	private String strAdd;
	private int intKor;
	private int intEng;
	private int intMath;
	private int intSum;
	private float floatAvg;
	
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
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
	public String getStrTel() {
		return strTel;
	}
	public void setStrTel(String strTel) {
		this.strTel = strTel;
	}
	public String getStrAdd() {
		return strAdd;
	}
	public void setStrAdd(String strAdd) {
		this.strAdd = strAdd;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", strName=" + strName + ", strTel=" + strTel + ", strAdd=" + strAdd
				+ ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath + "]";
	}
	

}
