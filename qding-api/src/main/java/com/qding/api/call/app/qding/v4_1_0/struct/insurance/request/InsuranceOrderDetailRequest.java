package com.qding.api.call.app.qding.v4_1_0.struct.insurance.request;

import com.qding.framework.common.api.struct.request.BaseRequest;

public class InsuranceOrderDetailRequest extends BaseRequest{

	private static final long serialVersionUID = 7906358427679151110L;
	
	private String orderNo;

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
