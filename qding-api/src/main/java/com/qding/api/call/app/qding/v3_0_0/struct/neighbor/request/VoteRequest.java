package com.qding.api.call.app.qding.v3_0_0.struct.neighbor.request;

import java.util.List;


import com.qding.api.annotation.ExplainAnnotation;
import com.qding.framework.common.api.struct.request.BaseRequest;
import com.qding.framework.common.smart.validate.Validate;
import com.qding.framework.common.smart.validate.rule.NotNullValidate;

/**
 * Created by qd on 2016/9/9.
 */
@Validate
public class VoteRequest extends BaseRequest {

    private static final long serialVersionUID = -23898966494461095L;

    @ExplainAnnotation(explain = "话题ID")
    @NotNullValidate
    private String topicId;

    @ExplainAnnotation(explain = "选中项", desc = "支持多选")
    @NotNullValidate
    private List<String> checkedIndexs;

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public List<String> getCheckedIndexs() {
        return checkedIndexs;
    }

    public void setCheckedIndexs(List<String> checkedIndexs) {
        this.checkedIndexs = checkedIndexs;
    }

    @Override
    public String toString() {
        return "VoteRequest{" +
                ", topicId='" + topicId + '\'' +
                ", checkedIndexs=" + checkedIndexs +
                '}';
    }
}
