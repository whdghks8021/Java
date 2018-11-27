package com.biz.ex02.vo;

public class GradeVO {
	
	private String strNum;
	private Integer intKor;
	private Integer intEng;
	private Integer intMath;
	private Integer intSum;
	private float floatAvg;
	
	public String getStrNum() {
		return strNum;
	}
	public void setStrNum(String strNum) {
		this.strNum = strNum;
	}
	public Integer getIntKor() {
		return intKor;
	}
	public void setIntKor(Integer intKor) {
		this.intKor = intKor;
	}
	public Integer getIntEng() {
		return intEng;
	}
	public void setIntEng(Integer intEng) {
		this.intEng = intEng;
	}
	public Integer getIntMath() {
		return intMath;
	}
	public void setIntMath(Integer intMath) {
		this.intMath = intMath;
	}
	public Integer getIntSum() {
		return intSum;
	}
	public void setIntSum(Integer intSum) {
		this.intSum = intSum;
	}
	public float getFloatAvg() {
		return floatAvg;
	}
	public void setFloatAvg(float floatAvg) {
		this.floatAvg = floatAvg;
	}
	@Override
	public String toString() {
		return "GradeVO [strNum=" + strNum + ", intKor=" + intKor + ", intEng=" + intEng + ", intMath=" + intMath
				+ ", intSum=" + intSum + ", floatAvg=" + floatAvg + "]";
	}

}
