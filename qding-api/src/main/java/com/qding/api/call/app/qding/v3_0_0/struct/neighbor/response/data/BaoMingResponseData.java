package com.qding.api.call.app.qding.v3_0_0.struct.neighbor.response.data;

import java.util.List;

import com.qding.api.annotation.ExplainAnnotation;
import com.qding.api.call.app.qding.v3_0_0.struct.neighbor.EnrollMember;
import com.qding.api.call.app.qding.v3_0_0.struct.neighbor.index.BriefMember;
import com.qding.api.struct.ResponseData;

/**
 * Created by qd on 2016/9/19.
 */
public class BaoMingResponseData extends ResponseData {

    private static final long serialVersionUID = -3921403925395359121L;

    @ExplainAnnotation(explain = "已报名用户列表")
    private List<EnrollMember> list;
    
    @ExplainAnnotation (explain = "分页分割时间")
  	private Long cursorTime;
    
    @ExplainAnnotation(explain = "是否有下一页")
    private boolean haveNextPage=false;

	public List<EnrollMember> getList() {
		return list;
	}

	public void setList(List<EnrollMember> list) {
		this.list = list;
	}

	public Long getCursorTime() {
		return cursorTime;
	}

	public void setCursorTime(Long cursorTime) {
		this.cursorTime = cursorTime;
	}

	public boolean isHaveNextPage() {
		return haveNextPage;
	}

	public void setHaveNextPage(boolean haveNextPage) {
		this.haveNextPage = haveNextPage;
	}

    
    
    
}
