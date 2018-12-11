package com.biz.inout.vo;

public class InoutVO {
	
	private String strDate;
	private String strInout;
	private String strPum;
	private int intDan;
	private int intSu;
	private int intTotal;
	
	public int getIntTotal() {
		return intTotal;
	}
	public void setIntTotal(int intTotal) {
		this.intTotal = intTotal;
	}
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public String getStrInout() {
		return strInout;
	}
	public void setStrInout(String strInout) {
		this.strInout = strInout;
	}
	public String getStrPum() {
		return strPum;
	}
	public void setStrPum(String strPum) {
		this.strPum = strPum;
	}
	public int getIntDan() {
		return intDan;
	}
	public void setIntDan(int intDan) {
		this.intDan = intDan;
	}
	public int getIntSu() {
		return intSu;
	}
	public void setIntSu(int intSu) {
		this.intSu = intSu;
	}
	@Override
	public String toString() {
		return "InoutVO [strDate=" + strDate + ", strInout=" + strInout + ", strPum=" + strPum + ", intDan=" + intDan
				+ ", intSu=" + intSu + "]";
	}

}
