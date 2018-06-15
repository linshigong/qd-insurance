package com.qding.api.call.app.qding.v2_6_0.struct.neighbor.request;

import com.qding.api.annotation.ExplainAnnotation;
import com.qding.framework.common.api.struct.request.BaseRequest;
import com.qding.framework.common.smart.validate.Validate;
import com.qding.framework.common.smart.validate.rule.NotNullValidate;

/**
 * Created by qd on 2016/9/9.
 */
@Validate
public class ReportTopicRequest extends BaseRequest {

    private static final long serialVersionUID = -5370744710698363653L;

    @ExplainAnnotation(explain = "会员ID")
    private String memberId;

    @NotNullValidate
    @ExplainAnnotation(explain = "账户ID")
    private String userId;

    @ExplainAnnotation(explain = "话题ID")
    private String topicId;

    @ExplainAnnotation(explain = "描述")
    private String content;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getTopicId() {
        return topicId;
    }

    public void setTopicId(String topicId) {
        this.topicId = topicId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "ReportTopicRequest{" +
                "memberId='" + memberId + '\'' +
                ", userId='" + userId + '\'' +
                ", topicId='" + topicId + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
