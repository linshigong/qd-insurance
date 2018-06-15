package com.qding.insurance.vo;

import com.qding.insurance.domain.CompensateRecord;

public class CompensateRecordVo extends CompensateRecord {

	private static final long serialVersionUID = 3816492810019192120L;
	
	private Integer compensateType;//理赔方式，1：按金额，2：按次数（次）
	
	private String insurantName; //被保险人姓名
	
	private String wareName; //商品名称
	
	

	public Integer getCompensateType() {
		return compensateType;
	}

	public void setCompensateType(Integer compensateType) {
		this.compensateType = compensateType;
	}

	public String getInsurantName() {
		return insurantName;
	}

	public void setInsurantName(String insurantName) {
		this.insurantName = insurantName;
	}

	public String getWareName() {
		return wareName;
	}

	public void setWareName(String wareName) {
		this.wareName = wareName;
	}

}
