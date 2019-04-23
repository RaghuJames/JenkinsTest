package com.restaurent.model;

public class SubMenuItemsDto {
	private String mcode;
	private String mdesc;
	private String smcode;
	private String smDesc;
	private String itCode;
	private String itDesc;
	private Double itPrice;
	
	public SubMenuItemsDto() {
		super();
	}
	public SubMenuItemsDto(String mcode, String mdesc, String smcode, String smDesc, String itCode, String itDesc,Double itPrice) {
		super();
		this.mcode = mcode;
		this.mdesc = mdesc;
		this.smcode = smcode;
		this.smDesc = smDesc;
		this.itCode = itCode;
		this.itDesc = itDesc;
		this.itPrice = itPrice;
	}
	public String getMcode() {
		return mcode;
	}
	public void setMcode(String mcode) {
		this.mcode = mcode;
	}
	public String getMdesc() {
		return mdesc;
	}
	public void setMdesc(String mdesc) {
		this.mdesc = mdesc;
	}
	public String getSmcode() {
		return smcode;
	}
	public void setSmcode(String smcode) {
		this.smcode = smcode;
	}
	public String getSmDesc() {
		return smDesc;
	}
	public void setSmDesc(String smDesc) {
		this.smDesc = smDesc;
	}
	public String getItCode() {
		return itCode;
	}
	public void setItCode(String itCode) {
		this.itCode = itCode;
	}
	public String getItDesc() {
		return itDesc;
	}
	public void setItDesc(String itDesc) {
		this.itDesc = itDesc;
	}
	public Double getItPrice() {
		return itPrice;
	}
	public void setItPrice(Double itPrice) {
		this.itPrice = itPrice;
	}
	
	
	
	
}
